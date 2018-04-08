package com.next.testZiroom;

import com.sleepycat.je.utilint.Timestamp;

import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;

public class ZiroomController {

	public static void main(String[] args) {
		for (int i = 1; i <= 156; i++) {
			doCrawl(i);
		}
	}

	private static void doCrawl(int i) {
		System.out.println("-------begin:" + new Timestamp(System.currentTimeMillis()));
		String path = "https://list.jd.com/list.html?cat=9987,653,655&page="+i+"&sort=sort_rank_asc&trans=1&JL=6_0_0&ms=6#J_main";
		final String crawlStorageFolder = "data/crawl/root";
		final int numberOfCrawlers = 1;

		final CrawlConfig config = new CrawlConfig();
		config.setCrawlStorageFolder(crawlStorageFolder);
		config.setPolitenessDelay(1000);
		config.setIncludeBinaryContentInCrawling(false);
		config.setMaxPagesToFetch(50);
		// config.setResumableCrawling(true);
		/*
		 * Instantiate the controller for this crawl.
		 */
		final PageFetcher pageFetcher = new PageFetcher(config);
		final RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
		final RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig, pageFetcher);
		CrawlController controller;
		try {
			controller = new CrawlController(config, pageFetcher, robotstxtServer);
			/*
			 * For each crawl, you need to add some seed urls. These are the first URLs that
			 * are fetched and then the crawler starts following links which are found in
			 * these pages
			 */
			controller.addSeed(path);

			/*
			 * Start the crawl. This is a blocking operation, meaning that your code will
			 * reach the line after this only when crawling is finished.
			 */
			controller.start(ZiroomCrawler.class, numberOfCrawlers);

			// final List<Object> crawlersLocalData = controller.getCrawlersLocalData();
			// long totalLinks = 0;
			// long totalTextSize = 0;
			// int totalProcessedPages = 0;
			// for (final Object localData : crawlersLocalData) {
			// final CrawlStat stat = (CrawlStat) localData;
			// totalLinks += stat.getTotalLinks();
			// totalTextSize += stat.getTotalTextSize();
			// totalProcessedPages += stat.getTotalProcessedPages();
			// }
			//
			// System.out.println("Aggregated Statistics:");
			// System.out.println("\tProcessed Pages: {}" + totalProcessedPages);
			// System.out.println("\tTotal Links found: {}" + totalLinks);
			// System.out.println("\tTotal Text Size: {}" + totalTextSize);
			System.out.println("---------------------------------爬取" + path + "结束！");

		} catch (final Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
