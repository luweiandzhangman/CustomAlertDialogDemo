# CustomAlertDialogDemo
自定义AlertDialog,高仿ios提示弹框,属性完全可以自定义,底部弹出,中间弹出都可,使用超简单,一套自定义控件解决项目中各种需要的弹框

![imgag](https://github.com/luweiandzhangman/CustomAlearDialogDemo/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20181214153423.jpg)
![imgag](https://github.com/luweiandzhangman/CustomAlearDialogDemo/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20181214153419.jpg)
![imgag](https://github.com/luweiandzhangman/CustomAlearDialogDemo/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20181214153416.jpg)
![imgag](https://github.com/luweiandzhangman/CustomAlearDialogDemo/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20181214153413.jpg)
![imgag](https://github.com/luweiandzhangman/CustomAlearDialogDemo/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20181214153407.jpg)
![imgag](https://github.com/luweiandzhangman/CustomAlearDialogDemo/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20181214153403.jpg)
![imgag](https://github.com/luweiandzhangman/CustomAlearDialogDemo/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20181214153354.jpg)


使用方法
下载demo,拿到控件--下面直接链式调用就OK



                        
                        
                      
    new CustomAlertDialog(this)
                        .builder()
                        .setCancelable(true)
                        .setTitle("标题加粗")
                        .setTitleTextColor("#000000")
                        .setTitleTextBold(true)
                        .setMsg("仿ios中间弹框,标题加粗/内容加粗/两个按钮变色")
                        .setMsgTextColor("#000000")
                        .setMsgTextBold(true)
                        .setOkButton("确定", 0, "#ffffff", "#F48F4A", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        })
                        .setCancleButton("取消", 0, "#ffffff", "#fade0a", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        })
                        .show();
