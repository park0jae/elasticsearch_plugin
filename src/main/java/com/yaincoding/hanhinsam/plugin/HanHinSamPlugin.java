package com.yaincoding.hanhinsam.plugin;

import java.util.HashMap;
import java.util.Map;
import com.yaincoding.hanhinsam.filters.chosung.ChosungFilterFactory;

import org.elasticsearch.index.analysis.TokenFilterFactory;
import org.elasticsearch.indices.analysis.AnalysisModule.AnalysisProvider;
import org.elasticsearch.plugins.AnalysisPlugin;
import org.elasticsearch.plugins.Plugin;

public class HanHinSamPlugin extends Plugin implements AnalysisPlugin {

	@Override
	public Map<String, AnalysisProvider<TokenFilterFactory>> getTokenFilters() {
		Map<String, AnalysisProvider<TokenFilterFactory>> extra = new HashMap<>();
		extra.put("hanhinsam_chosung", ChosungFilterFactory::new);
		return extra;
	}
}
