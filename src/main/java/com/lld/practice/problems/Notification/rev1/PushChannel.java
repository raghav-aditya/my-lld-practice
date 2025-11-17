package com.lld.practice.problems.Notification.rev1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PushChannel extends Channel{

    public PushChannel( )
    {
        super(ChannelType.PUSH);
    }

    @Override
    public void validate(String msg) {

        try{
            // logic to
        } catch ( Exception ex ) {
            throw ex;
        }
    }

    @Override
    public void sendNotification( String userId , String msg ) {

        try{
            validate(msg);
            log.info("Sending PushNotification to user: {} , " , userId );
        } catch ( Exception ex ){
            log.error(" error {} ", ex );
        }


    }
}
