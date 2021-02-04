package edu.mim.subsription.controller;

import edu.mim.subsription.model.Subscription;
import edu.mim.subsription.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/subscription")
public class SubscriptionController {
    @Autowired
    private SubscriptionService subscriptionService;

    @GetMapping("/{userId}")
    public Double findTotalSubscriptionByUserId(@PathVariable Long userId){
        return subscriptionService.totalSubscriptionByUserId(userId);
    }
    @PostMapping("/{userId}/{companyId}/{subscriptionPrice}")
    public Subscription addSubscriptionToUser(@PathVariable Long userId, @PathVariable Long companyId, @PathVariable Double subscriptionPrice ){
        return subscriptionService.addSubscriptionToUser(userId,companyId,subscriptionPrice);
    }

}
