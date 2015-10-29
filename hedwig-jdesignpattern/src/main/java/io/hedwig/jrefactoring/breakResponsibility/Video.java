package io.hedwig.jrefactoring.breakResponsibility;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by patrick on 15/10/29.
 */
public class Video {
    void payFee(double fee){
        System.out.println("pay fee");
    }

    void rentVideo(Video video,Customer customer){
        customer.videos.add(video);
    }

    Double calculateBalance(Customer customer){
        Double result = new Double(0);
        for (Double lateFee : customer.lateFees) {
            result+=lateFee;
        }

        return result;
    }

    public class Customer {
        List<Double> lateFees = Lists.newArrayList();
        List<Video> videos=Lists.newArrayList();

        public List<Double> getLateFees() {
            return lateFees;
        }

        public void setLateFees(List<Double> lateFees) {
            this.lateFees = lateFees;
        }

        public List<Video> getVideos() {
            return videos;
        }

        public void setVideos(List<Video> videos) {
            this.videos = videos;
        }
    }
}
