package com.bytedance.sdk.component.adexpress.rhi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends jhe {
    private fax kq;

    public rhi(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        kq(context, i10, i11, i12, jSONObject);
    }

    private void kq(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        fax faxVar = new fax(context, com.bytedance.sdk.component.adexpress.bob.kq.bob(context), i10, i11, i12, jSONObject);
        this.kq = faxVar;
        addView(faxVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.kq.setLayoutParams(layoutParams);
    }

    public fax getShakeView() {
        return this.kq;
    }

    public void setShakeText(String str) {
        if (this.kq == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.kq.setShakeText("");
        } else {
            this.kq.setShakeText(str);
        }
    }
}
