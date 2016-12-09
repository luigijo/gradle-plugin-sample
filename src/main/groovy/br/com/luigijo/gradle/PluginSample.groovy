package br.com.luigijo.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginSample implements Plugin<Project> {

	@Override
	void apply(Project  project) {
		
		project.task('hello') {
			println 'Hello plugin sample'
		}
		
	}
	
}