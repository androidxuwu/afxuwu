package com.example.haibeiapp.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/5/25 0025.
 */
public class Category {

    /**
     * code : 0
     * data : {"categories":[{"sub":[{"icon":"http://ec-img.ufile.ucloud.cn/dcef1394cb95442ba2269715bd0a78fb.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"洁面卸妆","banner":null,"id":6},{"icon":"http://ec-img.ufile.ucloud.cn/4d80149373fe4a76852cadebed8c9a27.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"面膜","banner":null,"id":11},{"icon":"http://ec-img.ufile.ucloud.cn/1d88a08d7e1e46e8ba92659f1b6ec283.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"爽肤水/化妆水","banner":null,"id":12},{"icon":"http://ec-img.ufile.ucloud.cn/86fd262c896c4b7ba4b0fa2a4c3b85e1.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"精华液/素","banner":null,"id":9},{"icon":"http://ec-img.ufile.ucloud.cn/2467e57663fd4122bac0ee37bef88fbc.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"卫生巾","banner":null,"id":20},{"icon":"http://ec-img.ufile.ucloud.cn/8a97343f9be84f35b1d8c8bc21ac8a92.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"面霜/乳液","banner":null,"id":8},{"icon":"http://ec-img.ufile.ucloud.cn/4dd965890cbc42608f6969e2e5a18dad.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"防晒隔离","banner":null,"id":14},{"icon":"http://ec-img.ufile.ucloud.cn/813c811491ef4862b022a406bb8f57b1.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"护手霜","banner":null,"id":13},{"icon":"http://ec-img.ufile.ucloud.cn/02b245341ed34c3eb6ec40e9a10a323f.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"眼霜/精华","banner":null,"id":7},{"icon":"http://ec-img.ufile.ucloud.cn/3c0b40d0d41c4657894e8915b5395d0d.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"牙刷牙膏","banner":null,"id":33},{"icon":"http://ec-img.ufile.ucloud.cn/8042fa74b831432284875a1ee9b6cc05.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"头发保养","banner":null,"id":44},{"icon":"http://ec-img.ufile.ucloud.cn/a3b0a59ecbf64bdd9b5e3fc043a1ec54.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"祛痘","banner":null,"id":40},{"icon":"http://ec-img.ufile.ucloud.cn/28d798b2c63f4f2ba85b3cfbdc9b37ce.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"唇膏/润唇膏","banner":null,"id":10}],"icon":"http://ec-img.ufile.ucloud.cn/a7e2f7cbc47b49409829be23dec36dd3.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"护肤个护","banner":null,"id":1},{"sub":[{"icon":"http://ec-img.ufile.ucloud.cn/ce737f5e189e430d88c980ae13481872.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"奶粉","banner":null,"id":21},{"icon":"http://ec-img.ufile.ucloud.cn/7ea7a1d6a98c43ed954e65a0f81c612b.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"纸尿裤","banner":null,"id":22},{"icon":"http://ec-img.ufile.ucloud.cn/64bedd1520484af2aaa830b059720404.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"辅食","banner":null,"id":50},{"icon":"http://ec-img.ufile.ucloud.cn/11a70e5141714aa9a274d24059238929.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"喂食","banner":null,"id":58},{"icon":"http://ec-img.ufile.ucloud.cn/2c49ee6fda8042c3b43329f2d1429d55.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"宝宝护理","banner":null,"id":60},{"icon":"http://ec-img.ufile.ucloud.cn/b43ed54785b04005b0e2925ffbb3c016.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"妈妈保养","banner":null,"id":61},{"icon":"http://ec-img.ufile.ucloud.cn/4495778f11b847f2ae9a54ecd8193473.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"工具","banner":null,"id":59}],"icon":"http://ec-img.ufile.ucloud.cn/8b8b6df1247c45e7b518152d46783c48.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"母婴用品","banner":null,"id":2},{"sub":[{"icon":"http://ec-img.ufile.ucloud.cn/7934c7d7e8d14918bc366fd0a3e2ffa4.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"粉底/液","banner":null,"id":15},{"icon":"http://ec-img.ufile.ucloud.cn/339f5c7402964ec2af09218ede64af42.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"散粉/粉饼","banner":null,"id":42},{"icon":"http://ec-img.ufile.ucloud.cn/636138ee386447c19d2f34d37e68b6ad.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"BB霜/CC霜","banner":null,"id":41},{"icon":"http://ec-img.ufile.ucloud.cn/c4ea01eac644477cb0635f35dfbfddc9.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"修容/高光","banner":null,"id":62},{"icon":"http://ec-img.ufile.ucloud.cn/c14da4c53c994ea3aefccd9c1d68af4a.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"腮红","banner":null,"id":37},{"icon":"http://ec-img.ufile.ucloud.cn/21f46f1d073f4d1e8c909b27e0a6fc48.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"美妆工具","banner":null,"id":19},{"icon":"http://ec-img.ufile.ucloud.cn/061b22fae3334cd68842d33138852f6b.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"眼妆","banner":null,"id":43}],"icon":"http://ec-img.ufile.ucloud.cn/9868ea464c4f4bb3b09d13a45e8f18b9.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"时尚彩妆","banner":null,"id":63},{"sub":[{"icon":"http://ec-img.ufile.ucloud.cn/53dfe32528c94bdb86880bd237a908f9.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"眼药水","banner":null,"id":36},{"icon":"http://ec-img.ufile.ucloud.cn/a1d78853629d43998802bca603cd0f60.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"计生用品","banner":null,"id":23}],"icon":"http://ec-img.ufile.ucloud.cn/da55d16d6ebc4fc584f4c5c6d4355bef.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"营养保健","banner":null,"id":5},{"sub":[{"icon":"http://ec-img.ufile.ucloud.cn/5f5b4bb567c547b28a1e56b6140652a2.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"巧克力","banner":null,"id":25},{"icon":"http://ec-img.ufile.ucloud.cn/84e51ad452b84ea7b76c31c8f59eb268.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"麦片","banner":null,"id":46},{"icon":"http://ec-img.ufile.ucloud.cn/7928bab91bd64779a3b03c7b765ad649.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"糖果","banner":null,"id":52}],"icon":"http://ec-img.ufile.ucloud.cn/7a9911a1a6a84fdba444cee9cf348434.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"进口美食","banner":null,"id":3},{"sub":[{"icon":"http://ec-img.ufile.ucloud.cn/18686b4286374897a1b2647c40656299.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"保温杯","banner":null,"id":32},{"icon":"http://ec-img.ufile.ucloud.cn/d8cf501f5fdf423aaeda9715bc272a2d.JPG?iopcmd=thumbnail&type=8&width=128&height=128","name":"清洁","banner":null,"id":45},{"icon":"http://ec-img.ufile.ucloud.cn/79ebc9283bc740b8bd0b78c4758ffdcd.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"便当","banner":null,"id":38},{"icon":"http://ec-img.ufile.ucloud.cn/3dc2ec60fd30457a8d52ce1fd25890fc.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"口罩","banner":null,"id":34},{"icon":"http://ec-img.ufile.ucloud.cn/4df5c19979a341aa943ea8c3fcaadaa1.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"电饭煲","banner":null,"id":39}],"icon":"http://ec-img.ufile.ucloud.cn/386cbf37a8594a6388f23d6377eae41e.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"家居用品","banner":null,"id":31},{"sub":[{"icon":null,"name":"牛仔裤","banner":null,"id":30},{"icon":"http://ec-img.ufile.ucloud.cn/484568efb7504b4b95a63f0dac7ae52e.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"包包","banner":null,"id":64},{"icon":"http://ec-img.ufile.ucloud.cn/a455e3b91d104218af370e35ed57e27e.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"钱包","banner":null,"id":65},{"icon":null,"name":"皮带","banner":null,"id":66},{"icon":"http://ec-img.ufile.ucloud.cn/af141a4ab1774f6d9c0ce1bbaf2a9fd2.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"钟表首饰","banner":null,"id":67}],"icon":"http://ec-img.ufile.ucloud.cn/10970e36cab5412396f0463b6f6d4b78.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"服饰箱包","banner":null,"id":4}]}
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
         * categories : [{"sub":[{"icon":"http://ec-img.ufile.ucloud.cn/dcef1394cb95442ba2269715bd0a78fb.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"洁面卸妆","banner":null,"id":6},{"icon":"http://ec-img.ufile.ucloud.cn/4d80149373fe4a76852cadebed8c9a27.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"面膜","banner":null,"id":11},{"icon":"http://ec-img.ufile.ucloud.cn/1d88a08d7e1e46e8ba92659f1b6ec283.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"爽肤水/化妆水","banner":null,"id":12},{"icon":"http://ec-img.ufile.ucloud.cn/86fd262c896c4b7ba4b0fa2a4c3b85e1.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"精华液/素","banner":null,"id":9},{"icon":"http://ec-img.ufile.ucloud.cn/2467e57663fd4122bac0ee37bef88fbc.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"卫生巾","banner":null,"id":20},{"icon":"http://ec-img.ufile.ucloud.cn/8a97343f9be84f35b1d8c8bc21ac8a92.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"面霜/乳液","banner":null,"id":8},{"icon":"http://ec-img.ufile.ucloud.cn/4dd965890cbc42608f6969e2e5a18dad.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"防晒隔离","banner":null,"id":14},{"icon":"http://ec-img.ufile.ucloud.cn/813c811491ef4862b022a406bb8f57b1.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"护手霜","banner":null,"id":13},{"icon":"http://ec-img.ufile.ucloud.cn/02b245341ed34c3eb6ec40e9a10a323f.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"眼霜/精华","banner":null,"id":7},{"icon":"http://ec-img.ufile.ucloud.cn/3c0b40d0d41c4657894e8915b5395d0d.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"牙刷牙膏","banner":null,"id":33},{"icon":"http://ec-img.ufile.ucloud.cn/8042fa74b831432284875a1ee9b6cc05.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"头发保养","banner":null,"id":44},{"icon":"http://ec-img.ufile.ucloud.cn/a3b0a59ecbf64bdd9b5e3fc043a1ec54.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"祛痘","banner":null,"id":40},{"icon":"http://ec-img.ufile.ucloud.cn/28d798b2c63f4f2ba85b3cfbdc9b37ce.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"唇膏/润唇膏","banner":null,"id":10}],"icon":"http://ec-img.ufile.ucloud.cn/a7e2f7cbc47b49409829be23dec36dd3.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"护肤个护","banner":null,"id":1},{"sub":[{"icon":"http://ec-img.ufile.ucloud.cn/ce737f5e189e430d88c980ae13481872.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"奶粉","banner":null,"id":21},{"icon":"http://ec-img.ufile.ucloud.cn/7ea7a1d6a98c43ed954e65a0f81c612b.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"纸尿裤","banner":null,"id":22},{"icon":"http://ec-img.ufile.ucloud.cn/64bedd1520484af2aaa830b059720404.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"辅食","banner":null,"id":50},{"icon":"http://ec-img.ufile.ucloud.cn/11a70e5141714aa9a274d24059238929.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"喂食","banner":null,"id":58},{"icon":"http://ec-img.ufile.ucloud.cn/2c49ee6fda8042c3b43329f2d1429d55.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"宝宝护理","banner":null,"id":60},{"icon":"http://ec-img.ufile.ucloud.cn/b43ed54785b04005b0e2925ffbb3c016.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"妈妈保养","banner":null,"id":61},{"icon":"http://ec-img.ufile.ucloud.cn/4495778f11b847f2ae9a54ecd8193473.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"工具","banner":null,"id":59}],"icon":"http://ec-img.ufile.ucloud.cn/8b8b6df1247c45e7b518152d46783c48.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"母婴用品","banner":null,"id":2},{"sub":[{"icon":"http://ec-img.ufile.ucloud.cn/7934c7d7e8d14918bc366fd0a3e2ffa4.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"粉底/液","banner":null,"id":15},{"icon":"http://ec-img.ufile.ucloud.cn/339f5c7402964ec2af09218ede64af42.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"散粉/粉饼","banner":null,"id":42},{"icon":"http://ec-img.ufile.ucloud.cn/636138ee386447c19d2f34d37e68b6ad.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"BB霜/CC霜","banner":null,"id":41},{"icon":"http://ec-img.ufile.ucloud.cn/c4ea01eac644477cb0635f35dfbfddc9.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"修容/高光","banner":null,"id":62},{"icon":"http://ec-img.ufile.ucloud.cn/c14da4c53c994ea3aefccd9c1d68af4a.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"腮红","banner":null,"id":37},{"icon":"http://ec-img.ufile.ucloud.cn/21f46f1d073f4d1e8c909b27e0a6fc48.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"美妆工具","banner":null,"id":19},{"icon":"http://ec-img.ufile.ucloud.cn/061b22fae3334cd68842d33138852f6b.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"眼妆","banner":null,"id":43}],"icon":"http://ec-img.ufile.ucloud.cn/9868ea464c4f4bb3b09d13a45e8f18b9.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"时尚彩妆","banner":null,"id":63},{"sub":[{"icon":"http://ec-img.ufile.ucloud.cn/53dfe32528c94bdb86880bd237a908f9.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"眼药水","banner":null,"id":36},{"icon":"http://ec-img.ufile.ucloud.cn/a1d78853629d43998802bca603cd0f60.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"计生用品","banner":null,"id":23}],"icon":"http://ec-img.ufile.ucloud.cn/da55d16d6ebc4fc584f4c5c6d4355bef.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"营养保健","banner":null,"id":5},{"sub":[{"icon":"http://ec-img.ufile.ucloud.cn/5f5b4bb567c547b28a1e56b6140652a2.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"巧克力","banner":null,"id":25},{"icon":"http://ec-img.ufile.ucloud.cn/84e51ad452b84ea7b76c31c8f59eb268.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"麦片","banner":null,"id":46},{"icon":"http://ec-img.ufile.ucloud.cn/7928bab91bd64779a3b03c7b765ad649.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"糖果","banner":null,"id":52}],"icon":"http://ec-img.ufile.ucloud.cn/7a9911a1a6a84fdba444cee9cf348434.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"进口美食","banner":null,"id":3},{"sub":[{"icon":"http://ec-img.ufile.ucloud.cn/18686b4286374897a1b2647c40656299.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"保温杯","banner":null,"id":32},{"icon":"http://ec-img.ufile.ucloud.cn/d8cf501f5fdf423aaeda9715bc272a2d.JPG?iopcmd=thumbnail&type=8&width=128&height=128","name":"清洁","banner":null,"id":45},{"icon":"http://ec-img.ufile.ucloud.cn/79ebc9283bc740b8bd0b78c4758ffdcd.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"便当","banner":null,"id":38},{"icon":"http://ec-img.ufile.ucloud.cn/3dc2ec60fd30457a8d52ce1fd25890fc.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"口罩","banner":null,"id":34},{"icon":"http://ec-img.ufile.ucloud.cn/4df5c19979a341aa943ea8c3fcaadaa1.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"电饭煲","banner":null,"id":39}],"icon":"http://ec-img.ufile.ucloud.cn/386cbf37a8594a6388f23d6377eae41e.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"家居用品","banner":null,"id":31},{"sub":[{"icon":null,"name":"牛仔裤","banner":null,"id":30},{"icon":"http://ec-img.ufile.ucloud.cn/484568efb7504b4b95a63f0dac7ae52e.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"包包","banner":null,"id":64},{"icon":"http://ec-img.ufile.ucloud.cn/a455e3b91d104218af370e35ed57e27e.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"钱包","banner":null,"id":65},{"icon":null,"name":"皮带","banner":null,"id":66},{"icon":"http://ec-img.ufile.ucloud.cn/af141a4ab1774f6d9c0ce1bbaf2a9fd2.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"钟表首饰","banner":null,"id":67}],"icon":"http://ec-img.ufile.ucloud.cn/10970e36cab5412396f0463b6f6d4b78.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"服饰箱包","banner":null,"id":4}]
         */
        private List<CategoriesEntity> categories;

        public void setCategories(List<CategoriesEntity> categories) {
            this.categories = categories;
        }

        public List<CategoriesEntity> getCategories() {
            return categories;
        }

        public class CategoriesEntity {
            /**
             * sub : [{"icon":"http://ec-img.ufile.ucloud.cn/dcef1394cb95442ba2269715bd0a78fb.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"洁面卸妆","banner":null,"id":6},{"icon":"http://ec-img.ufile.ucloud.cn/4d80149373fe4a76852cadebed8c9a27.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"面膜","banner":null,"id":11},{"icon":"http://ec-img.ufile.ucloud.cn/1d88a08d7e1e46e8ba92659f1b6ec283.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"爽肤水/化妆水","banner":null,"id":12},{"icon":"http://ec-img.ufile.ucloud.cn/86fd262c896c4b7ba4b0fa2a4c3b85e1.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"精华液/素","banner":null,"id":9},{"icon":"http://ec-img.ufile.ucloud.cn/2467e57663fd4122bac0ee37bef88fbc.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"卫生巾","banner":null,"id":20},{"icon":"http://ec-img.ufile.ucloud.cn/8a97343f9be84f35b1d8c8bc21ac8a92.png?iopcmd=thumbnail&type=8&width=128&height=128","name":"面霜/乳液","banner":null,"id":8},{"icon":"http://ec-img.ufile.ucloud.cn/4dd965890cbc42608f6969e2e5a18dad.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"防晒隔离","banner":null,"id":14},{"icon":"http://ec-img.ufile.ucloud.cn/813c811491ef4862b022a406bb8f57b1.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"护手霜","banner":null,"id":13},{"icon":"http://ec-img.ufile.ucloud.cn/02b245341ed34c3eb6ec40e9a10a323f.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"眼霜/精华","banner":null,"id":7},{"icon":"http://ec-img.ufile.ucloud.cn/3c0b40d0d41c4657894e8915b5395d0d.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"牙刷牙膏","banner":null,"id":33},{"icon":"http://ec-img.ufile.ucloud.cn/8042fa74b831432284875a1ee9b6cc05.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"头发保养","banner":null,"id":44},{"icon":"http://ec-img.ufile.ucloud.cn/a3b0a59ecbf64bdd9b5e3fc043a1ec54.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"祛痘","banner":null,"id":40},{"icon":"http://ec-img.ufile.ucloud.cn/28d798b2c63f4f2ba85b3cfbdc9b37ce.jpg?iopcmd=thumbnail&type=8&width=128&height=128","name":"唇膏/润唇膏","banner":null,"id":10}]
             * icon : http://ec-img.ufile.ucloud.cn/a7e2f7cbc47b49409829be23dec36dd3.png?iopcmd=thumbnail&type=8&width=128&height=128
             * name : 护肤个护
             * banner : null
             * id : 1
             */
            private List<SubEntity> sub;
            private String icon;
            private String name;
            private String banner;
            private int id;

            public void setSub(List<SubEntity> sub) {
                this.sub = sub;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setBanner(String banner) {
                this.banner = banner;
            }

            public void setId(int id) {
                this.id = id;
            }

            public List<SubEntity> getSub() {
                return sub;
            }

            public String getIcon() {
                return icon;
            }

            public String getName() {
                return name;
            }

            public String getBanner() {
                return banner;
            }

            public int getId() {
                return id;
            }

            public class SubEntity {
                /**
                 * icon : http://ec-img.ufile.ucloud.cn/dcef1394cb95442ba2269715bd0a78fb.jpg?iopcmd=thumbnail&type=8&width=128&height=128
                 * name : 洁面卸妆
                 * banner : null
                 * id : 6
                 */
                private String icon;
                private String name;
                private String banner;
                private int id;

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setBanner(String banner) {
                    this.banner = banner;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getIcon() {
                    return icon;
                }

                public String getName() {
                    return name;
                }

                public String getBanner() {
                    return banner;
                }

                public int getId() {
                    return id;
                }
            }
        }
    }
}
