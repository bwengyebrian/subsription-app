package edu.mim.subsription.service;

import edu.mim.subsription.model.Subscription;
import edu.mim.subsription.model.User;

import java.util.List;

public interface SubscriptionService extends CrudService<Subscription,Long> {

    List<Subscription> findSubscriptionByUser(User user);
    List<Subscription> findSubscriptionByUserId(Long id);
    Double totalSubscriptionOfUser(User user);
    Double totalSubscriptionByUserId(Long id);
    Subscription addSubscriptionToUser(Long userId, Long companyId, Double subscriptionPrice);
}
