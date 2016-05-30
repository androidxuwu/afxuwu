package com.example.haibeiapp.bean;


import java.util.List;

/**
 * Created by Administrator on 2016/5/28 0028.
 */
public class Details {

    /**
     * code : 0
     * data : {"product":{"category_id":11,"current_sku":{"discount":13,"id":10360076,"list_price":{"CNY":6719},"real_price":{"CNY":5893},"spec":null,"stock":194},"custom_properties":[],"desc":"产品名称：Kose 高丝 透明质酸净白面膜22mL×5片\r\n品牌：Kose/高丝\r\n产地：日本\r\n面膜分类：面膜贴\r\n规格：5片/盒\r\n保质期：3年\r\n适合肤质：所有肤质\r\n功效：保湿补水 美白淡斑 恢复弹性\n","desc_html":"\n<!DOCTYPE html>\n<html lang=\"zh-cn\"><head>\n    <meta charset=\"UTF-8\">\n    <title><\/title>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n    <style>\n        img {\n            border: 0;\n            width: 100%;\n            display: block;\n        }\n         p {\n            -webkit-margin-before: 0rem;\n            -webkit-margin-after: 0rem;\n        }\n    <\/style>\n<\/head>\n<body style=\"margin:0 auto;\">\n<p>产品名称：Kose 高丝 透明质酸净白面膜22mL×5片\r\n品牌：Kose/高丝\r\n产地：日本\r\n面膜分类：面膜贴\r\n规格：5片/盒\r\n保质期：3年\r\n适合肤质：所有肤质\r\n功效：保湿补水 美白淡斑 恢复弹性<\/p>\n<\/body>\n<\/html>\n","fav_count":6,"favorite":false,"id":10360076,"images":[{"h":500,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/d1b10b1ca8c141a6b2740cdd4cbc83aa.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/d1b10b1ca8c141a6b2740cdd4cbc83aa.jpg","w":349}],"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"name":"Kose/高丝 净白面膜（透明质酸）5片 (22mL×5)","review_count":0,"score":8,"skus":[{"discount":13,"id":10360076,"list_price":{"CNY":6719},"real_price":{"CNY":5893},"spec":null,"stock":194}],"specs":{}}}
     * success : true
     */

    private int code;
    /**
     * product : {"category_id":11,"current_sku":{"discount":13,"id":10360076,"list_price":{"CNY":6719},"real_price":{"CNY":5893},"spec":null,"stock":194},"custom_properties":[],"desc":"产品名称：Kose 高丝 透明质酸净白面膜22mL×5片\r\n品牌：Kose/高丝\r\n产地：日本\r\n面膜分类：面膜贴\r\n规格：5片/盒\r\n保质期：3年\r\n适合肤质：所有肤质\r\n功效：保湿补水 美白淡斑 恢复弹性\n","desc_html":"\n<!DOCTYPE html>\n<html lang=\"zh-cn\"><head>\n    <meta charset=\"UTF-8\">\n    <title><\/title>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n    <style>\n        img {\n            border: 0;\n            width: 100%;\n            display: block;\n        }\n         p {\n            -webkit-margin-before: 0rem;\n            -webkit-margin-after: 0rem;\n        }\n    <\/style>\n<\/head>\n<body style=\"margin:0 auto;\">\n<p>产品名称：Kose 高丝 透明质酸净白面膜22mL×5片\r\n品牌：Kose/高丝\r\n产地：日本\r\n面膜分类：面膜贴\r\n规格：5片/盒\r\n保质期：3年\r\n适合肤质：所有肤质\r\n功效：保湿补水 美白淡斑 恢复弹性<\/p>\n<\/body>\n<\/html>\n","fav_count":6,"favorite":false,"id":10360076,"images":[{"h":500,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/d1b10b1ca8c141a6b2740cdd4cbc83aa.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/d1b10b1ca8c141a6b2740cdd4cbc83aa.jpg","w":349}],"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"name":"Kose/高丝 净白面膜（透明质酸）5片 (22mL×5)","review_count":0,"score":8,"skus":[{"discount":13,"id":10360076,"list_price":{"CNY":6719},"real_price":{"CNY":5893},"spec":null,"stock":194}],"specs":{}}
     */

    private DataBean data;
    private boolean success;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class DataBean {
        /**
         * category_id : 11
         * current_sku : {"discount":13,"id":10360076,"list_price":{"CNY":6719},"real_price":{"CNY":5893},"spec":null,"stock":194}
         * custom_properties : []
         * desc : 产品名称：Kose 高丝 透明质酸净白面膜22mL×5片
         品牌：Kose/高丝
         产地：日本
         面膜分类：面膜贴
         规格：5片/盒
         保质期：3年
         适合肤质：所有肤质
         功效：保湿补水 美白淡斑 恢复弹性

         * desc_html :
         <!DOCTYPE html>
         <html lang="zh-cn"><head>
         <meta charset="UTF-8">
         <title></title>
         <meta name="viewport" content="width=device-width, initial-scale=1">
         <style>
         img {
         border: 0;
         width: 100%;
         display: block;
         }
         p {
         -webkit-margin-before: 0rem;
         -webkit-margin-after: 0rem;
         }
         </style>
         </head>
         <body style="margin:0 auto;">
         <p>产品名称：Kose 高丝 透明质酸净白面膜22mL×5片
         品牌：Kose/高丝
         产地：日本
         面膜分类：面膜贴
         规格：5片/盒
         保质期：3年
         适合肤质：所有肤质
         功效：保湿补水 美白淡斑 恢复弹性</p>
         </body>
         </html>

         * fav_count : 6
         * favorite : false
         * id : 10360076
         * images : [{"h":500,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/d1b10b1ca8c141a6b2740cdd4cbc83aa.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/d1b10b1ca8c141a6b2740cdd4cbc83aa.jpg","w":349}]
         * location : 日本
         * merchant : {"id":84843049,"name":"海呗自营","score":8}
         * name : Kose/高丝 净白面膜（透明质酸）5片 (22mL×5)
         * review_count : 0
         * score : 8
         * skus : [{"discount":13,"id":10360076,"list_price":{"CNY":6719},"real_price":{"CNY":5893},"spec":null,"stock":194}]
         * specs : {}
         */

        private ProductBean product;

        public ProductBean getProduct() {
            return product;
        }

        public void setProduct(ProductBean product) {
            this.product = product;
        }

        public static class ProductBean {
            private int category_id;
            /**
             * discount : 13
             * id : 10360076
             * list_price : {"CNY":6719}
             * real_price : {"CNY":5893}
             * spec : null
             * stock : 194
             */

            private CurrentSkuBean current_sku;
            private String desc;
            private String desc_html;
            private int fav_count;
            private boolean favorite;
            private int id;
            private String location;
            /**
             * id : 84843049
             * name : 海呗自营
             * score : 8
             */

            private MerchantBean merchant;
            private String name;
            private int review_count;
            private int score;
            private SpecsBean specs;
            private List<?> custom_properties;
            /**
             * h : 500
             * t_h : 256
             * t_w : 256
             * thumb : http://ec-img.ufile.ucloud.cn/d1b10b1ca8c141a6b2740cdd4cbc83aa.jpg?iopcmd=thumbnail&type=8&width=256&height=256
             * url : http://ec-img.ufile.ucloud.cn/d1b10b1ca8c141a6b2740cdd4cbc83aa.jpg
             * w : 349
             */

            private List<ImagesBean> images;
            /**
             * discount : 13
             * id : 10360076
             * list_price : {"CNY":6719}
             * real_price : {"CNY":5893}
             * spec : null
             * stock : 194
             */

            private List<SkusBean> skus;

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public CurrentSkuBean getCurrent_sku() {
                return current_sku;
            }

            public void setCurrent_sku(CurrentSkuBean current_sku) {
                this.current_sku = current_sku;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDesc_html() {
                return desc_html;
            }

            public void setDesc_html(String desc_html) {
                this.desc_html = desc_html;
            }

            public int getFav_count() {
                return fav_count;
            }

            public void setFav_count(int fav_count) {
                this.fav_count = fav_count;
            }

            public boolean isFavorite() {
                return favorite;
            }

            public void setFavorite(boolean favorite) {
                this.favorite = favorite;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public MerchantBean getMerchant() {
                return merchant;
            }

            public void setMerchant(MerchantBean merchant) {
                this.merchant = merchant;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getReview_count() {
                return review_count;
            }

            public void setReview_count(int review_count) {
                this.review_count = review_count;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public SpecsBean getSpecs() {
                return specs;
            }

            public void setSpecs(SpecsBean specs) {
                this.specs = specs;
            }

            public List<?> getCustom_properties() {
                return custom_properties;
            }

            public void setCustom_properties(List<?> custom_properties) {
                this.custom_properties = custom_properties;
            }

            public List<ImagesBean> getImages() {
                return images;
            }

            public void setImages(List<ImagesBean> images) {
                this.images = images;
            }

            public List<SkusBean> getSkus() {
                return skus;
            }

            public void setSkus(List<SkusBean> skus) {
                this.skus = skus;
            }

            public static class CurrentSkuBean {
                private int discount;
                private int id;
                /**
                 * CNY : 6719
                 */

                private ListPriceBean list_price;
                /**
                 * CNY : 5893
                 */

                private RealPriceBean real_price;
                private Object spec;
                private int stock;

                public int getDiscount() {
                    return discount;
                }

                public void setDiscount(int discount) {
                    this.discount = discount;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public ListPriceBean getList_price() {
                    return list_price;
                }

                public void setList_price(ListPriceBean list_price) {
                    this.list_price = list_price;
                }

                public RealPriceBean getReal_price() {
                    return real_price;
                }

                public void setReal_price(RealPriceBean real_price) {
                    this.real_price = real_price;
                }

                public Object getSpec() {
                    return spec;
                }

                public void setSpec(Object spec) {
                    this.spec = spec;
                }

                public int getStock() {
                    return stock;
                }

                public void setStock(int stock) {
                    this.stock = stock;
                }

                public static class ListPriceBean {
                    private int CNY;

                    public int getCNY() {
                        return CNY;
                    }

                    public void setCNY(int CNY) {
                        this.CNY = CNY;
                    }
                }

                public static class RealPriceBean {
                    private int CNY;

                    public int getCNY() {
                        return CNY;
                    }

                    public void setCNY(int CNY) {
                        this.CNY = CNY;
                    }
                }
            }

            public static class MerchantBean {
                private int id;
                private String name;
                private int score;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getScore() {
                    return score;
                }

                public void setScore(int score) {
                    this.score = score;
                }
            }

            public static class SpecsBean {
            }

            public static class ImagesBean {
                private int h;
                private int t_h;
                private int t_w;
                private String thumb;
                private String url;
                private int w;

                public int getH() {
                    return h;
                }

                public void setH(int h) {
                    this.h = h;
                }

                public int getT_h() {
                    return t_h;
                }

                public void setT_h(int t_h) {
                    this.t_h = t_h;
                }

                public int getT_w() {
                    return t_w;
                }

                public void setT_w(int t_w) {
                    this.t_w = t_w;
                }

                public String getThumb() {
                    return thumb;
                }

                public void setThumb(String thumb) {
                    this.thumb = thumb;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getW() {
                    return w;
                }

                public void setW(int w) {
                    this.w = w;
                }
            }

            public static class SkusBean {
                private int discount;
                private int id;
                /**
                 * CNY : 6719
                 */

                private ListPriceBean list_price;
                /**
                 * CNY : 5893
                 */

                private RealPriceBean real_price;
                private Object spec;
                private int stock;

                public int getDiscount() {
                    return discount;
                }

                public void setDiscount(int discount) {
                    this.discount = discount;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public ListPriceBean getList_price() {
                    return list_price;
                }

                public void setList_price(ListPriceBean list_price) {
                    this.list_price = list_price;
                }

                public RealPriceBean getReal_price() {
                    return real_price;
                }

                public void setReal_price(RealPriceBean real_price) {
                    this.real_price = real_price;
                }

                public Object getSpec() {
                    return spec;
                }

                public void setSpec(Object spec) {
                    this.spec = spec;
                }

                public int getStock() {
                    return stock;
                }

                public void setStock(int stock) {
                    this.stock = stock;
                }

                public static class ListPriceBean {
                    private int CNY;

                    public int getCNY() {
                        return CNY;
                    }

                    public void setCNY(int CNY) {
                        this.CNY = CNY;
                    }
                }

                public static class RealPriceBean {
                    private int CNY;

                    public int getCNY() {
                        return CNY;
                    }

                    public void setCNY(int CNY) {
                        this.CNY = CNY;
                    }
                }
            }
        }
    }
}
