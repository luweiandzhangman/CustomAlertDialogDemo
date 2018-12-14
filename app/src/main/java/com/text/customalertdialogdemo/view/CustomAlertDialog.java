package com.text.customalertdialogdemo.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.text.customalertdialogdemo.R;

/**
 * Created by lw on 2018/6/19.
 * 仿ios的弹框--可显示在中间 也可显示在底部
 */

public class CustomAlertDialog {
    private Context context;

    private Dialog dialog;

    private LinearLayout lLayout_bg;
    private RelativeLayout lLayout_bg_bottom;

    private TextView txt_title;

    private TextView txt_msg;

    private Button btn_ok;

    private Button btn_cancle;

    private ImageView iv_split_horizontal;
    private ImageView img_line;

    private Display display;

    private boolean showTitle = false;

    private boolean showMsg = false;

    private boolean showOkBtn = false;

    private boolean showCancleBtn = false;

    public CustomAlertDialog(Context context) {
        this.context = context;
        WindowManager windowManager = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        display = windowManager.getDefaultDisplay();
    }


    public CustomAlertDialog builder() {
        View view = LayoutInflater.from(context).inflate(
                R.layout.view_alertdialog, null);

        lLayout_bg = view.findViewById(R.id.lLayout_bg);
        txt_title = view.findViewById(R.id.txt_title);
        txt_title.setVisibility(View.GONE);
        txt_msg = view.findViewById(R.id.txt_msg);
        txt_msg.setVisibility(View.GONE);
        btn_ok = view.findViewById(R.id.btn_ok);
        btn_ok.setVisibility(View.GONE);
        btn_cancle = view.findViewById(R.id.btn_cancle);
        btn_cancle.setVisibility(View.GONE);
        iv_split_horizontal = view.findViewById(R.id.iv_split_horizontal);
        iv_split_horizontal.setVisibility(View.INVISIBLE);
        img_line = view.findViewById(R.id.img_line);
        img_line.setVisibility(View.GONE);

        dialog = new Dialog(context, R.style.AlertDialogStyle);
        dialog.setContentView(view);

        lLayout_bg.setLayoutParams(new FrameLayout.LayoutParams((int) (display
                .getWidth() * 0.70), WindowManager.LayoutParams.WRAP_CONTENT));

        return this;
    }


    public CustomAlertDialog builderBottom() {
        View view = LayoutInflater.from(context).inflate(
                R.layout.view_alertdialog_bottom, null);

        lLayout_bg_bottom = view.findViewById(R.id.lLayout_bg);
        txt_title = view.findViewById(R.id.txt_title);
        txt_title.setVisibility(View.GONE);
        txt_msg = view.findViewById(R.id.txt_msg);
        txt_msg.setVisibility(View.GONE);
        btn_ok = view.findViewById(R.id.btn_ok);
        btn_ok.setVisibility(View.GONE);
        btn_cancle = view.findViewById(R.id.btn_cancle);
        btn_cancle.setVisibility(View.GONE);
        iv_split_horizontal = view.findViewById(R.id.iv_split_horizontal);
        iv_split_horizontal.setVisibility(View.INVISIBLE);
        img_line = view.findViewById(R.id.img_line);
        img_line.setVisibility(View.GONE);

        dialog = new Dialog(context, R.style.AlertDialogStyle);
        dialog.setContentView(view);

        lLayout_bg_bottom.setLayoutParams(new FrameLayout.LayoutParams((int) (display
                .getWidth()), WindowManager.LayoutParams.WRAP_CONTENT));

        return this;
    }


    public CustomAlertDialog setTitle(String title) {
        showTitle = true;
        if ("".equals(title)) {
            txt_title.setText("标题");
        } else {
            txt_title.setText(title);
        }
        return this;
    }

    public CustomAlertDialog setTitleTextColor(String color) {
        if (color != null) {
            txt_title.setTextColor(Color.parseColor(color));
        }
        return this;
    }

    public CustomAlertDialog setTitleTextSizeSp(int size) {
        if (size != 0) {
            txt_title.setTextSize(size);
        }
        return this;
    }

    public CustomAlertDialog setTitleTextBold(boolean b) {
        if (b) {
            TextPaint tp = txt_title.getPaint();
            tp.setFakeBoldText(true);
        } else {
            TextPaint tp = txt_title.getPaint();
            tp.setFakeBoldText(false);
        }
        return this;
    }


    public CustomAlertDialog setMsg(String msg) {
        showMsg = true;
        if ("".equals(msg)) {
            txt_msg.setText("内容");
        } else {
            txt_msg.setText(msg);
        }
        return this;
    }


    public CustomAlertDialog setMsgTextColor(String color) {
        if (color != null) {
            txt_msg.setTextColor(Color.parseColor(color));
        }
        return this;
    }

    public CustomAlertDialog setMsgTextBold(boolean b) {
        if (b) {
            TextPaint tp = txt_msg.getPaint();
            tp.setFakeBoldText(true);
        } else {
            TextPaint tp = txt_msg.getPaint();
            tp.setFakeBoldText(false);
        }
        return this;
    }

    public CustomAlertDialog setMsgTextSizeSp(int size) {
        if (size != 0) {
            txt_msg.setTextSize(size);
        }
        return this;
    }


    public CustomAlertDialog setCancelable(boolean cancel) {
        dialog.setCancelable(cancel);
        return this;
    }

    /**
     * textSizeSp传0默认大小
     * textColor传""默认颜色
     * btnBgColor传""按钮默认背景颜色
     */
    public CustomAlertDialog setOkButton(String text, int textSizeSp, String textColor, String btnBgColor,
                                         final View.OnClickListener listener) {
        showOkBtn = true;
        if ("".equals(text)) {
            btn_ok.setText("确定");
        } else {
            btn_ok.setText(text);
        }
        if (0 != textSizeSp) {
            btn_ok.setTextSize(textSizeSp);
        }
        if ("" != textColor) {
            btn_ok.setTextColor(Color.parseColor(textColor));
        }
        if ("" != btnBgColor) {
            btn_ok.setBackgroundColor(Color.parseColor(btnBgColor));
        }

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                listener.onClick(v);
                dialog.dismiss();
            }
        });
        return this;
    }

    /**
     * textSizeSp传0默认大小
     * textColor传""默认颜色
     * btnBgColor传""按钮默认背景颜色
     */
    public CustomAlertDialog setCancleButton(String text, int textSizeSp, String textColor, String btnBgColor,
                                             final View.OnClickListener listener) {
        showCancleBtn = true;
        if ("".equals(text)) {
            btn_cancle.setText("取消");
        } else {
            btn_cancle.setText(text);
        }

        if (0 != textSizeSp) {
            btn_cancle.setTextSize(textSizeSp);
        }
        if ("" != textColor) {
            btn_cancle.setTextColor(Color.parseColor(textColor));
        }
        if ("" != btnBgColor) {
            btn_cancle.setBackgroundColor(Color.parseColor(btnBgColor));
        }
        btn_cancle.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                listener.onClick(v);
                dialog.dismiss();
            }
        });
        return this;
    }

    private void setLayout() {
        if (!showTitle && !showMsg) {
            txt_title.setText("提示");
            txt_title.setVisibility(View.VISIBLE);
        }

        if (showTitle) {
            txt_title.setVisibility(View.VISIBLE);
        }
        if (showMsg) {
            txt_msg.setVisibility(View.VISIBLE);
        }
        //都不显示
        if (!showOkBtn && !showCancleBtn) {
            iv_split_horizontal.setVisibility(View.INVISIBLE);
            btn_cancle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });
        }

        if (showOkBtn && showCancleBtn) {
            btn_cancle.setVisibility(View.VISIBLE);
            iv_split_horizontal.setVisibility(View.VISIBLE);
            btn_ok.setVisibility(View.VISIBLE);
            img_line.setVisibility(View.VISIBLE);
        }

        if (showOkBtn && !showCancleBtn) {
            btn_ok.setVisibility(View.VISIBLE);
            iv_split_horizontal.setVisibility(View.VISIBLE);
        }
        if (!showOkBtn && showCancleBtn) {
            btn_cancle.setVisibility(View.VISIBLE);
            iv_split_horizontal.setVisibility(View.VISIBLE);
        }
    }

    public void show() {
        setLayout();
        dialog.show();
    }
}
