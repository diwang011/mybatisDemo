package com.next.scheduled;

import java.util.Date;
import java.util.List;

import org.assertj.core.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.next.db.model.FunProduct;
import com.next.scheduled.jd.JDCrawler;
import com.next.service.FunProductService;
import com.sleepycat.je.utilint.Timestamp;

import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;

@Component
public class ProductScheduled {
	private static final Logger logger = LoggerFactory.getLogger(ProductScheduled.class);

	public final static long ONE_Minute = 2 * 60 * 1000;
	@Autowired
	private FunProductService funProductService;

	@Scheduled(fixedDelay = ONE_Minute)
	public void fixedDelayJob() {
		logger.info(DateUtil.formatAsDatetime(new Date()) + " >>ProductScheduled开始执行....");
		saveProduct();
		logger.info(DateUtil.formatAsDatetime(new Date()) + " >>ProductScheduled结束....");
	}

	private void saveProduct() {
		for (int i = 1; i <= 156; i++) {
			doCrawl(i);
		}
	}

	private void doCrawl(int i) {
		System.out.println("-------begin:" + new Timestamp(System.currentTimeMillis()));
		String path = "https://list.jd.com/list.html?cat=9987,653,655&page=" + i
				+ "&sort=sort_rank_asc&trans=1&JL=6_0_0&ms=6#J_main";
		final String crawlStorageFolder = "data/crawl/root";
		final int numberOfCrawlers = 10;

		final CrawlConfig config = new CrawlConfig();
		config.setCrawlStorageFolder(crawlStorageFolder);
		config.setPolitenessDelay(1000);
		config.setIncludeBinaryContentInCrawling(false);
		config.setMaxPagesToFetch(50);
		// config.setResumableCrawling(true);
		final PageFetcher pageFetcher = new PageFetcher(config);
		final RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
		final RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig, pageFetcher);
		CrawlController controller;
		try {
			controller = new CrawlController(config, pageFetcher, robotstxtServer);
			controller.addSeed(path);
			controller.start(JDCrawler.class, numberOfCrawlers);
			final List<Object> crawlersLocalData = controller.getCrawlersLocalData();
			for (final Object localData : crawlersLocalData) {
				final FunProduct product = (FunProduct) localData;
				funProductService.save(product);
			}
			System.out.println("---------------------------------爬取" + path + "结束！");

		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	// private List<UserInfo> updateOrderListByTask(List<UserInfo> userList) {
	// ExecutorService pool = Executors.newFixedThreadPool(userList.size());
	// List<Future<UserInfo>> list = new ArrayList<Future<UserInfo>>();
	// for (UserInfo uu : userList) {
	// Callable<UserInfo> c = new OrderCallable(orderBizService, uu);
	// Future<UserInfo> f = pool.submit(c);
	// list.add(f);
	// }
	// pool.shutdown();
	// List<UserInfo> uuList = new ArrayList<UserInfo>();
	// for (Future<UserInfo> f : list) {
	// try {
	// UserInfo uu = f.get();
	// if (uu != null) {
	// uuList.add(uu);
	// }
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// return uuList;
	// }
}
