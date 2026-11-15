package com.bytedance.sdk.component.adexpress.rhi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fax extends gm {
    private TextView kq;

    public fax(@NonNull Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, view, i10, i11, i12, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.rhi.gm
    protected void kq(Context context, View view) {
        addView(view);
        this.kq = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.rhi.gm
    public void setShakeText(String str) {
        if (this.kq == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.kq.setText(str);
            return;
        }
        try {
            this.kq.setText(com.bytedance.sdk.component.utils.uml.oq(this.kq.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e10) {
            e10.getMessage();
        }
    }
}
