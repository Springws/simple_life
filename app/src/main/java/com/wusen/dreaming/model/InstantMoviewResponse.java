package com.wusen.dreaming.model;

import java.util.List;

/**
 * 正在上映的电影
 * Created by wusen on 2017/12/14.
 */

public class InstantMoviewResponse {
    private String title;
    private int total;
    private List<EntriesBean> entries;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<EntriesBean> getEntries() {
        return entries;
    }

    public void setEntries(List<EntriesBean> entries) {
        this.entries = entries;
    }

    public static class EntriesBean {
        /**
         * rating : 9.1
         * pubdate : 2017-11-24
         * title : 寻梦环游记
         * wish : 53385
         * original_title : Coco
         * collection : 258335
         * orignal_title : Coco
         * stars : 45
         * images : {"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp"}
         * id : 20495023
         */

        private String rating;
        private String pubdate;
        private String title;
        private int wish;
        private String original_title;
        private int collection;
        private String orignal_title;
        private String stars;
        private ImagesBean images;
        private String id;

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getPubdate() {
            return pubdate;
        }

        public void setPubdate(String pubdate) {
            this.pubdate = pubdate;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getWish() {
            return wish;
        }

        public void setWish(int wish) {
            this.wish = wish;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public int getCollection() {
            return collection;
        }

        public void setCollection(int collection) {
            this.collection = collection;
        }

        public String getOrignal_title() {
            return orignal_title;
        }

        public void setOrignal_title(String orignal_title) {
            this.orignal_title = orignal_title;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class ImagesBean {
            /**
             * large : http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp
             * small : http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp
             * medium : http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp
             */

            private String large;
            private String small;
            private String medium;

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }
}
