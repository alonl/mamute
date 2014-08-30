package org.mamute.infra;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import javax.inject.Inject;

import org.mamute.components.RecentTagsContainer;
import org.mamute.dao.NewsDAO;
import org.mamute.infra.rss.read.FeedsMap;
import org.mamute.infra.rss.read.RSSFeed;

import br.com.caelum.vraptor.Result;
import org.mamute.model.TagUsage;

public class SideBarInfo {

	@Inject private NewsDAO newses;
	@Inject private Result result;
	@Inject private RecentTagsContainer tagsContainer;
	@Inject private FeedsMap feedsMap;

	public void include(){
		result.include("sidebarNews", newses.allVisibleAndApproved(5));
        List<TagUsage> recentTagsUsage = tagsContainer.getRecentTagsUsage();
        if (recentTagsUsage.size() > 6) recentTagsUsage = recentTagsUsage.subList(0, 6);
		result.include("recentTags", recentTagsUsage);
		Set<Entry<String, RSSFeed>> entrySet = feedsMap.entrySet();
		for (Entry<String, RSSFeed> entry : entrySet) {
			result.include(entry.getKey(), entry.getValue());
		}
	}
}
