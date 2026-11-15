package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.uml;
import com.bytedance.sdk.openadsdk.utils.bss;

/* JADX INFO: loaded from: classes.dex */
public class syt extends Button {
    public syt(Context context) {
        super(context);
        kq();
    }

    private void kq() {
        setId(com.bytedance.sdk.openadsdk.utils.mxq.mz);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, bss.oq(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.ubx.kq(context, "tt_browser_download_selector"));
        setText(uml.kq(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
