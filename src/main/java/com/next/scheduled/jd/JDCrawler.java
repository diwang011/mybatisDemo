package com.next.scheduled.jd;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.util.StringUtils;

import com.next.db.model.FunProduct;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;

public class JDCrawler extends WebCrawler {


	/** 爬取匹配原则 */
	private final static Pattern FILTERS = Pattern.compile(".*(\\.(css|js|bmp|gif|jpe?g|ico"
			+ "|png|tiff?|mid|mp2|mp3|mp4" + "|wav|avi|mov|mpeg|ram|m4v|pdf" + "|rm|smil|wmv|swf|wma|zip|rar|gz))$");

	private final static String STARTPATH="https://list.jd.com/list.html";
	/**
	 * You should implement this function to specify whether the given url should be
	 * crawled or not (based on your crawling logic).
	 */
	List<FunProduct> myCrawlStat;

	public JDCrawler() throws IOException {
		myCrawlStat = new LinkedList<FunProduct>();
	}

	@Override
	public Object getMyLocalData() {
		return myCrawlStat;
	}

	@Override
	public void onBeforeExit() {
		getMyId();
	}

	/*
	 * 这个方法决定了要抓取的URL及其内容，例子中只允许抓取“http://sh.ziroom.com/z/nl/”这个域的页面,
	 * 不允许.css、.js和多媒体等文件
	 *
	 * @see edu.uci.ics.crawler4j.crawler.WebCrawler#shouldVisit(edu.uci.ics.
	 * crawler4j.crawler.Page, edu.uci.ics.crawler4j.url.WebURL)
	 */
	@Override
	public boolean shouldVisit(Page referringPage, WebURL url) {
		final String href = url.getURL().toLowerCase();

		if (FILTERS.matcher(href).matches()&& href.startsWith(STARTPATH)) {
			return false;
		}
		return true;
	}

	/*
	 * 当URL下载完成会调用这个方法。你可以轻松获取下载页面的url, 文本, 链接, html,和唯一id等内容。
	 *
	 * @see edu.uci.ics.crawler4j.crawler.WebCrawler#visit(edu.uci.ics.crawler4j.
	 * crawler.Page)
	 */
	@Override
	public void visit(Page page) {
		final String url = page.getWebURL().getURL();
		System.out.println("-----------爬取路径：" + url);
		if (page.getParseData() instanceof HtmlParseData) {
			final HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();
			final Set<WebURL> links = htmlParseData.getOutgoingUrls();
			final String html = htmlParseData.getHtml();
			final Document doc = Jsoup.parse(html);
			final Element plist = doc.select("#plist").get(0);
			Elements contents = plist.select("li[class=gl-item]");
			for (final Element c : contents) {// 名称 ul[gl-item]
				// 名称
				final String name = c.select(".p-name em").first().text();
				System.out.println("名称：" + name);

				// 图片
				final String img = c.select(".p-img").get(0).select("img").attr("data-lazy-img");
				System.out.println("图片：" + img);

				// 店铺名称
				final String shopName = c.select(".p-shop").get(0).attr("data-shop_name");
				System.out.println("店铺名称：" + shopName);

				// sku
				final String sku = c.select(".p-focus").get(0).select("a").attr("data-sku");
				System.out.println("sku：" + sku);

				// 路径
				final String path = c.select(".p-name").get(0).select("a").attr("href");
				System.out.println("路径：" + path);

				// 价格
				final String pirce = c.select(".p-price em").first().text();
				System.out.println("价格：" + pirce);

				FunProduct p = new FunProduct();
				p.setProductName(name);
				p.setImg(img);
				p.setShopName(shopName);
				p.setSku(sku);
				p.setPath(path);
				BigDecimal b = null;
				if (!StringUtils.isEmpty(pirce)) {
					b = new BigDecimal(pirce);
				}
				p.setPirce(b);
				p.setCreatedBy("-9999");
				p.setCreatedDate(new Date());
				myCrawlStat.add(p);
			}
		}
	}

}