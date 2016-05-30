package com.example.haibeiapp.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/5/21 0021.
 */
public class Discover {

    /**
     * code : 0
     * data : {"topics":[{"image":"http://ec-img.ufile.ucloud.cn/68749ac5660246cca2977e6964be55ed.jpg","id":11,"title":"现货专区","desc":""},{"image":"http://ec-img.ufile.ucloud.cn/650833bc0c194f889f6bd1cc694a7ca3.jpg","id":8,"title":"日本妈妈都在用它们","desc":""},{"image":"http://ec-img.ufile.ucloud.cn/9e8840a847a94fc78379482e8ccced0f.jpg","id":10,"title":"给宝宝的，只有直邮才放心","desc":""},{"image":"http://ec-img.ufile.ucloud.cn/d14f03a4629649c9ab41ad9a9648d60c.jpg","id":9,"title":"买COACH，不用去专柜","desc":"1941年，COACH诞生于纽约曼哈顿，秉承近75年来精湛手工工艺及独具匠心的创造力，融合美国悠久文化与历史，不断钻研并致力于打造纽约现代奢华风尚。产品系列包括手袋、钱包、服饰、鞋履、配饰等。COACH专注细节，精益求精的设计理念，无不彰显美国高端生活时尚。"},{"image":"http://ec-img.ufile.ucloud.cn/e035d0f062584baf959713635de78880.jpg","id":7,"title":"吃土也要败的女神爱用物","desc":null},{"image":"http://ec-img.ufile.ucloud.cn/ac4f8096ae0146c88803390c2b7f0c66.png","id":1,"title":"护肤保湿","desc":null},{"image":"http://ec-img.ufile.ucloud.cn/10fbe715e91d44fa89b9da673c103cd1.jpg","id":2,"title":"花王-乐而雅","desc":null},{"image":"http://ec-img.ufile.ucloud.cn/d0e1543ac9104bdfb4ed8dead9df003c.jpg","id":4,"title":"Thermos保温杯","desc":null}]}
     * success : true
     */
    private int code;
    private DataEntity data;
    private boolean success;

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public DataEntity getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public class DataEntity {
        /**
         * topics : [{"image":"http://ec-img.ufile.ucloud.cn/68749ac5660246cca2977e6964be55ed.jpg","id":11,"title":"现货专区","desc":""},{"image":"http://ec-img.ufile.ucloud.cn/650833bc0c194f889f6bd1cc694a7ca3.jpg","id":8,"title":"日本妈妈都在用它们","desc":""},{"image":"http://ec-img.ufile.ucloud.cn/9e8840a847a94fc78379482e8ccced0f.jpg","id":10,"title":"给宝宝的，只有直邮才放心","desc":""},{"image":"http://ec-img.ufile.ucloud.cn/d14f03a4629649c9ab41ad9a9648d60c.jpg","id":9,"title":"买COACH，不用去专柜","desc":"1941年，COACH诞生于纽约曼哈顿，秉承近75年来精湛手工工艺及独具匠心的创造力，融合美国悠久文化与历史，不断钻研并致力于打造纽约现代奢华风尚。产品系列包括手袋、钱包、服饰、鞋履、配饰等。COACH专注细节，精益求精的设计理念，无不彰显美国高端生活时尚。"},{"image":"http://ec-img.ufile.ucloud.cn/e035d0f062584baf959713635de78880.jpg","id":7,"title":"吃土也要败的女神爱用物","desc":null},{"image":"http://ec-img.ufile.ucloud.cn/ac4f8096ae0146c88803390c2b7f0c66.png","id":1,"title":"护肤保湿","desc":null},{"image":"http://ec-img.ufile.ucloud.cn/10fbe715e91d44fa89b9da673c103cd1.jpg","id":2,"title":"花王-乐而雅","desc":null},{"image":"http://ec-img.ufile.ucloud.cn/d0e1543ac9104bdfb4ed8dead9df003c.jpg","id":4,"title":"Thermos保温杯","desc":null}]
         */
        private List<TopicsEntity> topics;

        public void setTopics(List<TopicsEntity> topics) {
            this.topics = topics;
        }

        public List<TopicsEntity> getTopics() {
            return topics;
        }

        public class TopicsEntity {
            /**
             * image : http://ec-img.ufile.ucloud.cn/68749ac5660246cca2977e6964be55ed.jpg
             * id : 11
             * title : 现货专区
             * desc :
             */
            private String image;
            private int id;
            private String title;
            private String desc;

            public void setImage(String image) {
                this.image = image;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getImage() {
                return image;
            }

            public int getId() {
                return id;
            }

            public String getTitle() {
                return title;
            }

            public String getDesc() {
                return desc;
            }
        }
    }
}
