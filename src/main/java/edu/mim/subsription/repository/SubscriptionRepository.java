package edu.mim.subsription.repository;

import edu.mim.subsription.model.Subscription;
import edu.mim.subsription.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {
    List<Subscription> findBySubscriptionUser(User user);
}
