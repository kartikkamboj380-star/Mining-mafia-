package com.bytedance.sdk.component.rhi.kq.rhi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class rhi implements csi {
    private Context kq;

    public rhi(Context context) {
        this.kq = context;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.rhi.csi
    public void bob(fou fouVar) {
        com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(this.kq, "trackurl", "id=?", new String[]{fouVar.kq()});
    }

    @Override // com.bytedance.sdk.component.rhi.kq.rhi.csi
    public List<fou> kq() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorKq = com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(this.kq, "trackurl", null, null, null, null, null, null);
        if (cursorKq != null) {
            while (cursorKq.moveToNext()) {
                try {
                    try {
                        String string = cursorKq.getString(cursorKq.getColumnIndex("id"));
                        String string2 = cursorKq.getString(cursorKq.getColumnIndex("url"));
                        boolean z9 = cursorKq.getInt(cursorKq.getColumnIndex("replaceholder")) > 0;
                        int i10 = cursorKq.getInt(cursorKq.getColumnIndex("retry"));
                        int i11 = cursorKq.getInt(cursorKq.getColumnIndex("url_type"));
                        String string3 = cursorKq.getString(cursorKq.getColumnIndex("ad_id"));
                        String string4 = cursorKq.getString(cursorKq.getColumnIndex("error_code"));
                        String string5 = cursorKq.getString(cursorKq.getColumnIndex("error_msg"));
                        fou fouVar = new fou(string, string2, z9, i11, string3);
                        fouVar.kq(i10);
                        if (!TextUtils.isEmpty(string4)) {
                            fouVar.kq(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            fouVar.oq(string5);
                        }
                        linkedList.add(fouVar);
                    } catch (Throwable unused) {
                        return linkedList;
                    }
                } finally {
                    cursorKq.close();
                }
            }
            cursorKq.close();
            return linkedList;
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.rhi.csi
    public void oq(fou fouVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fouVar.kq());
        contentValues.put("url", fouVar.oq());
        contentValues.put("replaceholder", Integer.valueOf(fouVar.bob() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(fouVar.fou()));
        contentValues.put("error_code", fouVar.rjo());
        contentValues.put("error_msg", fouVar.dgq());
        contentValues.put("url_type", Integer.valueOf(fouVar.csi()));
        contentValues.put("ad_id", fouVar.rhi());
        com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(this.kq, "trackurl", contentValues, "id=?", new String[]{fouVar.kq()});
    }

    public static String oq() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.rhi.kq.rhi.csi
    public fou kq(String str) {
        Cursor cursorKq = com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(this.kq, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (cursorKq != null && cursorKq.moveToFirst()) {
            try {
                String string = cursorKq.getString(cursorKq.getColumnIndex("id"));
                String string2 = cursorKq.getString(cursorKq.getColumnIndex("url"));
                boolean z9 = cursorKq.getInt(cursorKq.getColumnIndex("replaceholder")) > 0;
                int i10 = cursorKq.getInt(cursorKq.getColumnIndex("retry"));
                int i11 = cursorKq.getInt(cursorKq.getColumnIndex("url_type"));
                String string3 = cursorKq.getString(cursorKq.getColumnIndex("ad_id"));
                String string4 = cursorKq.getString(cursorKq.getColumnIndex("error_code"));
                String string5 = cursorKq.getString(cursorKq.getColumnIndex("error_msg"));
                fou fouVar = new fou(string, string2, z9, i11, string3);
                fouVar.kq(i10);
                if (!TextUtils.isEmpty(string4)) {
                    fouVar.kq(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    fouVar.oq(string5);
                }
                cursorKq.close();
                return fouVar;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    cursorKq.close();
                    cursorKq = null;
                } catch (Throwable th2) {
                    cursorKq.close();
                    throw th2;
                }
            }
        }
        if (cursorKq != null) {
            cursorKq.close();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.rhi.csi
    public void kq(fou fouVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fouVar.kq());
        contentValues.put("url", fouVar.oq());
        contentValues.put("replaceholder", Integer.valueOf(fouVar.bob() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(fouVar.fou()));
        contentValues.put("url_type", Integer.valueOf(fouVar.csi()));
        contentValues.put("ad_id", fouVar.rhi());
        contentValues.put("error_code", fouVar.rjo());
        contentValues.put("error_msg", fouVar.dgq());
        com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(this.kq, "trackurl", contentValues);
    }
}
