package com.lld.practice.problems.Notification.rev1;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@Data
public class ChannelFactory {

    private static final Map< ChannelType , Channel > map = new HashMap<>();

    static {

        map.put( ChannelType.EMAIL , new EmailChannel() );
        map.put( ChannelType.PUSH , new PushChannel() );
        map.put( ChannelType.SMS , new SmsChannel() );
    }


    public static Channel getChannel( ChannelType channelType ){

        if(!map.containsKey(channelType))
        throw new IllegalArgumentException("Invalid Channel");

        return map.get(channelType);
    }
}
