# CustomAlearDialogDemo
自定义AlearDialog,高仿ios提示弹框,属性完全可以自定义,底部弹出,中间弹出都可,使用超简单
使用方法
下载demo,拿到控件
new CustomAlertDialog(this)
                        .builder()
                        .setCancelable(true)
                        .setTitle("标题")
                        .setMsg("仿ios中间弹框,标题/内容/两个按钮")
                        .setOkButton("确定", 0, "", "", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        })
                        .setCancleButton("取消", 0, "", "", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        })
                        .show();
