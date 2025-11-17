package com.lld.practice.problems.Notification.rev1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailChannel extends Channel{


    public EmailChannel()
    {
        super(ChannelType.EMAIL);
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
            log.info("Sending Email to user: {} , " , userId );
        } catch ( Exception ex ){
            log.error(" error {} ", ex );
        }


    }
}
