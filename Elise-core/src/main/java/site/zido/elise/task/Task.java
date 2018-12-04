package site.zido.elise.task;

import site.zido.elise.select.configurable.ModelExtractor;

/**
 * Task interface
 *
 * @author zido
 */
public interface Task {
    /**
     * Get task id
     *
     * @return id id
     */
    Long getId();

    /**
     * get the model extractor
     *
     * @return extractors model extractor
     */
    ModelExtractor modelExtractor();
}