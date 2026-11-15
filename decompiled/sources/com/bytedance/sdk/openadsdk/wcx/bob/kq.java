package com.bytedance.sdk.openadsdk.wcx.bob;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private final SharedPreferences kq;

    public kq(Context context) {
        this.kq = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public long kq() {
        return this.kq.getLong("last_upload_time", 0L);
    }

    public void kq(long j10) {
        SharedPreferences.Editor editorEdit = this.kq.edit();
        editorEdit.putLong("last_upload_time", j10);
        editorEdit.apply();
    }
}
