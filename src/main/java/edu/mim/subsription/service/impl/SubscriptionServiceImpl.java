package edu.mim.subsription.service.impl;

import edu.mim.subsription.model.Company;
import edu.mim.subsription.model.Subscription;
import edu.mim.subsription.model.User;
import edu.mim.subsription.repository.SubscriptionRepository;
import edu.mim.subsription.repository.UserRepository;
import edu.mim.subsription.service.CompanyService;
import edu.mim.subsription.service.SubscriptionService;
import edu.mim.subsription.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Autowired
    private SubscriptionRepository subscriptionRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private CompanyService companyService;
    @Override
    public Subscription save(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription findById(Long id) {
        return subscriptionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Subscription> findAll() {
        return subscriptionRepository.findAll();
    }

    @Override
    public void delete(Subscription subscription) {
        subscriptionRepository.delete(subscription);
    }

    @Override
    public void deleteById(Long id) {
        subscriptionRepository.deleteById(id);
    }

    @Override
    public List<Subscription> findSubscriptionByUser(User user) {
        return subscriptionRepository.findBySubscriptionUser(user);
    }

    @Override
    public List<Subscription> findSubscriptionByUserId(Long id) {
        User user = userService.findById(id);
        return findSubscriptionByUser(user);
    }

    @Override
    public Double totalSubscriptionOfUser(User user) {
        List<Subscription> subscriptions = findSubscriptionByUser(user);
        Double sum = 0.0;
        for (Subscription subscription : subscriptions){
            sum += subscription.getSubscriptionCharge();
        }
        return sum;
    }

    @Override
    public Double totalSubscriptionByUserId(Long id) {
        User user = userService.findById(id);
        return totalSubscriptionOfUser(user);
    }

    @Override
    public Subscription addSubscriptionToUser(Long userId, Long companyId, Double subscriptionPrice) {
        User user = userService.findById(userId);
        Company company = companyService.findById(companyId);
        Subscription subscription = new Subscription();
        subscription.setSubscriptionUser(user);
        subscription.setSubscriptionCompany(company);
        subscription.setSubscriptionCharge(subscriptionPrice);
        subscription.setSubscriptionDate(LocalDateTime.now());
        return this.save(subscription);
    }
}
