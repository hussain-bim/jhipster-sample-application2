package io.github.jhipster.application.service.impl;

import io.github.jhipster.application.service.ActivityService;
import io.github.jhipster.application.domain.Activity;
import io.github.jhipster.application.repository.ActivityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing {@link Activity}.
 */
@Service
@Transactional
public class ActivityServiceImpl implements ActivityService {

    private final Logger log = LoggerFactory.getLogger(ActivityServiceImpl.class);

    private final ActivityRepository activityRepository;

    public ActivityServiceImpl(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    /**
     * Save a activity.
     *
     * @param activity the entity to save.
     * @return the persisted entity.
     */
    @Override
    public Activity save(Activity activity) {
        log.debug("Request to save Activity : {}", activity);
        return activityRepository.save(activity);
    }

    /**
     * Get all the activities.
     *
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public List<Activity> findAll() {
        log.debug("Request to get all Activities");
        return activityRepository.findAll();
    }


    /**
     * Get one activity by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<Activity> findOne(Long id) {
        log.debug("Request to get Activity : {}", id);
        return activityRepository.findById(id);
    }

    /**
     * Delete the activity by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Activity : {}", id);
        activityRepository.deleteById(id);
    }
}
