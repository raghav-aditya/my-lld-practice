package com.lld.practice.problems.Notification.rev1;

public class NotifcationManagementService {


    public static void main( String args[] )
    {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification( "aditya" , "hello" , ChannelType.PUSH );
    }

}
