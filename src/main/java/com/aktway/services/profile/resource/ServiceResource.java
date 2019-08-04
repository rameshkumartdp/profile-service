package com.aktway.services.profile.resource;

import com.aktway.services.profile.api.response.*;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.inject.Inject;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@Produces(MediaType.APPLICATION_JSON)
public class ServiceResource {

    @Inject
    FollowersProfileData followersProfileData;

    @Inject
    FollowingProfileData followingProfileData;

    @Inject
    FolloweesPostData followeesPostData;

    @Inject
    MyPublicPostData myPublicPostData;

    @Inject
    MyPrivatePostData myPrivatePostData;

    private static final Logger LOGGER = Logger.getLogger(ServiceResource.class.getName());
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/followersprofile")
    public FollowersProfileData getFollowersProfileData(@RequestParam("accessToken") String accessToken) {

        followersProfileData.setProfileName("Narendra Manam");
        followersProfileData.setFollowersCount(10);
        followersProfileData.setFollowingCount(8);
        followersProfileData.isFollwing();
        followersProfileData.isFriend();
        followersProfileData.setGender("M");
        followersProfileData.setProfilePicture("../../../assets/images/mockData/narendra_manam.jpg");

        return followersProfileData;
    }

    @RequestMapping("/followingprofile")
    public FollowingProfileData getFollowingProfileData(@RequestParam("accessToken") String accessToken) {

        followingProfileData.setProfileName("Narendra Manam");
        followingProfileData.setFollowersCount(10);
        followingProfileData.setFollowingCount(8);
        followingProfileData.isFriend();
        followingProfileData.setGender("M");
        followingProfileData.setProfilePicture("../../../assets/images/mockData/narendra_manam.jpg");

        return followingProfileData;
    }

    @RequestMapping("/followeespost")
    public FolloweesPostData getFolloweesPostData(@RequestParam("accessToken") String accessToken) {

        followeesPostData.setPostName("My new car");
        followeesPostData.setTagList(Arrays.asList("#Bangalore"));
        followeesPostData.setPostedBy("Narendra");
        followeesPostData.setGender("M");
        followeesPostData.setLikeCount(12);
        followeesPostData.setCommentCount(21);
        followeesPostData.setTagCount(5);
        followeesPostData.isLiked();
        followeesPostData.setPostId("A0001");
        followeesPostData.setPostedDate("Mon Jun 10 2019 13:45:44 GMT+0530 (India Standard Time)");
        followeesPostData.setUserProfilePic("../../../assets/images/mockData/narendra_manam.jpg");
        followeesPostData.setPostPicture("../../../assets/images/mockData/posts/car_image-2.jpg");

        return followeesPostData;
    }

    @RequestMapping("/publicpost")
    public MyPublicPostData getMyPublicPostData(@RequestParam("accessToken") String accessToken) {

        myPublicPostData.setPostName("Beautiful bird");
        myPublicPostData.setLikeCount(16392);
        myPublicPostData.setCommentCount(2051);
        myPublicPostData.setTagCount(5895);
        myPublicPostData.setPostId("MPUA0010");
        myPublicPostData.setPostedDate("Sun Feb 24 2019 17:15:44 GMT+0530 (India Standard Time)");
        myPublicPostData.setPostPicture("../../../assets/images/mockData/posts/post_bird-1.jpg");

        return myPublicPostData;
    }

    @RequestMapping("/privatepost")
    public MyPrivatePostData getMyPrivatePostData(@RequestParam("accessToken") String accessToken) {

        myPrivatePostData.setPostName("Nice building");
        myPrivatePostData.setTagList(Arrays.asList("#Malaysia"));
        myPrivatePostData.setPostId("MPRA0006");
        myPrivatePostData.setPostedDate("Tue Jan 01 2019 12:00:44 GMT+0530 (India Standard Time)");
        myPrivatePostData.setPostPicture("../../../assets/images/mockData/posts/post_location-1.jpg");

        return myPrivatePostData;
    }
}
