package com.lld.practice.problems.Notification.rev1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Channel {

    private ChannelType channelType ;

    public Channel( ChannelType channelType )
    {
        this.channelType = channelType ;
    }

    public abstract void validate(String msg);
    public abstract void sendNotification( String userId , String msg );

}
