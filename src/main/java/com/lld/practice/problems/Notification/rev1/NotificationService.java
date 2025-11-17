package com.lld.practice.problems.Notification.rev1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private ChannelFactory channelFactory;

    public void sendNotification( String userId , String msg , ChannelType channelType ){
        channelFactory.getChannel( channelType).sendNotification( userId , msg );
    }

}
