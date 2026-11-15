package com.bytedance.sdk.component.rhi.kq.kq.kq.kq;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.rhi.kq.syt;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rjo extends bob {
    private com.bytedance.sdk.component.rhi.kq.fou.oq.kq bob;
    protected List<String> kq;

    public rjo(Context context, com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar) {
        super(context);
        this.kq = new ArrayList();
        this.bob = kqVar;
        if (kqVar == null) {
            this.bob = com.bytedance.sdk.component.rhi.kq.fou.oq.kq.bob();
        }
    }

    public byte bob() {
        return (byte) 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0023: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int fou() {
        Cursor cursorKq;
        int i10 = 0;
        try {
            cursorKq = com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(csi(), oq(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorKq != null) {
                try {
                    cursorKq.moveToFirst();
                    i10 = cursorKq.getInt(0);
                } catch (Throwable unused) {
                    if (cursorKq != null) {
                        try {
                            cursorKq.close();
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            if (cursorKq != null) {
                cursorKq.close();
            }
        } catch (Throwable unused3) {
            cursorKq = null;
        }
        return i10;
    }

    public byte kq() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.kq.kq.bob
    public String oq() {
        return syt.rjo().fou().fou();
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.kq.kq.bob
    protected long rhi() {
        return com.bytedance.sdk.component.rhi.kq.rjo.kq.oq();
    }

    public static String bob(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public List<com.bytedance.sdk.component.rhi.kq.fou.kq> kq(int i10, String str) {
        long jKq = com.bytedance.sdk.component.rhi.kq.oq.kq.kq(i10, csi());
        if (jKq <= 0) {
            jKq = 1;
        } else if (jKq > 100) {
            jKq = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.kq.clear();
        Cursor cursorKq = com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(csi(), oq(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + jKq);
        if (cursorKq != null) {
            while (cursorKq.moveToNext()) {
                try {
                    try {
                        String string = cursorKq.getString(cursorKq.getColumnIndex("id"));
                        String string2 = cursorKq.getString(cursorKq.getColumnIndex("value"));
                        if (cursorKq.getInt(cursorKq.getColumnIndex("encrypt")) == 1) {
                            string2 = syt.rjo().mxq().kq(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.kq.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.rhi.kq.fou.kq.kq kqVar = new com.bytedance.sdk.component.rhi.kq.fou.kq.kq(string, new JSONObject(string2));
                            kqVar.oq(bob());
                            kqVar.kq(kq());
                            arrayList.add(kqVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        cursorKq.close();
                        if (!this.kq.isEmpty()) {
                            kq(this.kq);
                            this.kq.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    public List<com.bytedance.sdk.component.rhi.kq.fou.kq> oq(String str) {
        com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar = this.bob;
        return kqVar == null ? new ArrayList() : kq(kqVar.oq(), str);
    }

    public void oq(List<com.bytedance.sdk.component.rhi.kq.fou.kq> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.rhi.kq.fou.kq kqVar : list) {
            linkedList.add(kqVar.bob());
            com.bytedance.sdk.component.rhi.kq.bob.kq.nn(kqVar);
        }
        oq();
        linkedList.size();
        com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(csi(), "DELETE FROM " + oq() + " WHERE " + kq("id", linkedList, 1000, true));
        bob(linkedList);
    }

    private void oq(int i10, long j10) {
        com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(csi(), oq(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)});
    }

    protected void kq(List<String> list) {
        oq();
        list.size();
        com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(csi(), "DELETE FROM " + oq() + " WHERE " + kq("id", list, 1000, true));
        com.bytedance.sdk.component.rhi.kq.bob.oq.kq(com.bytedance.sdk.component.rhi.kq.oq.fou.fou.ea(), list.size());
        bob(list);
    }

    public void kq(int i10, long j10) {
        oq(i10, j10);
    }

    public boolean kq(int i10) {
        return this.bob != null && fou() >= this.bob.kq();
    }

    private static String kq(String str, List<?> list, int i10, boolean z9) {
        int i11;
        String str2 = z9 ? " IN " : " NOT IN ";
        String str3 = z9 ? " OR " : " AND ";
        int iMin = Math.min(i10, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i11 = size / iMin;
        } else {
            i11 = (size / iMin) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * iMin;
            String strKq = kq(TextUtils.join("','", list.subList(i13, Math.min(i13 + iMin, size))), "");
            if (i12 != 0) {
                sb.append(str3);
            }
            sb.append(str);
            sb.append(str2);
            sb.append("('");
            sb.append(strKq);
            sb.append("')");
        }
        return kq(sb.toString(), str + str2 + "('')");
    }

    private static String kq(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
