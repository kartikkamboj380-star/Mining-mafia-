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
public class kq extends bob {
    private final Context bob;
    private com.bytedance.sdk.component.rhi.kq.fou.oq.kq fou;
    protected List<String> kq;

    public kq(Context context, com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar) {
        super(context);
        this.kq = new ArrayList();
        this.bob = context;
        this.fou = kqVar;
        if (kqVar == null) {
            this.fou = com.bytedance.sdk.component.rhi.kq.fou.oq.kq.bob();
        }
    }

    public byte bob() {
        return (byte) 2;
    }

    public byte fou() {
        return (byte) 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0027 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r0 r1
      0x0027: PHI (r0v3 int) = (r0v0 int), (r0v5 int) binds: [B:15:0x0031, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:15:0x0031, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int kq() {
        Cursor cursorKq = null;
        int i10 = 0;
        try {
            cursorKq = com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(csi(), oq(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorKq != null) {
                cursorKq.moveToFirst();
                i10 = cursorKq.getInt(0);
            }
        } catch (Exception unused) {
        } finally {
            if (cursorKq != null) {
                try {
                    cursorKq.close();
                } catch (Exception unused2) {
                }
            }
        }
        return i10;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.kq.kq.bob
    public String oq() {
        com.bytedance.sdk.component.rhi.kq.kq.csi csiVarFou = syt.rjo().fou();
        if (csiVarFou != null) {
            return csiVarFou.oq();
        }
        return null;
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

    public List<com.bytedance.sdk.component.rhi.kq.fou.kq> kq(int i10, String str) {
        String str2;
        String[] strArr;
        String str3;
        byte b10;
        Cursor cursorKq;
        long jKq = com.bytedance.sdk.component.rhi.kq.oq.kq.kq(i10, csi());
        oq();
        if (jKq <= 0) {
            jKq = 1;
        } else if (jKq > 100) {
            jKq = 100;
        }
        String str4 = str + " DESC limit " + jKq;
        ArrayList arrayList = new ArrayList();
        this.kq.clear();
        long jSns = syt.rjo().sns();
        if (jSns > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jSns)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.rhi.kq.bob.kq.fou() && fou() == 3) {
            str3 = "id";
            b10 = 3;
            cursorKq = com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(csi(), oq(), new String[]{"id", "value", "encrypt", "channel"}, str2, strArr, null, null, str4);
        } else {
            str3 = "id";
            b10 = 3;
            cursorKq = com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(csi(), oq(), new String[]{str3, "value", "encrypt"}, str2, strArr, null, null, str4);
        }
        Cursor cursor = cursorKq;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.rhi.kq.csi csiVarMxq = syt.rjo().mxq();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex("value"));
                        int i11 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i12 = (com.bytedance.sdk.component.rhi.kq.bob.kq.fou() && fou() == b10) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i11 == 1) {
                            try {
                                string2 = csiVarMxq.kq(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.kq.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.rhi.kq.fou.kq.kq kqVar = new com.bytedance.sdk.component.rhi.kq.fou.kq.kq(string, jSONObject);
                            kqVar.kq(fou());
                            kqVar.oq(bob());
                            if (com.bytedance.sdk.component.rhi.kq.bob.kq.fou() && fou() == b10) {
                                kqVar.kq(i12);
                            }
                            com.bytedance.sdk.component.rhi.kq.bob.kq.kq(jSONObject, kqVar);
                            arrayList.add(kqVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                try {
                    cursor.close();
                    if (!this.kq.isEmpty()) {
                        kq(this.kq);
                        this.kq.clear();
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th3) {
                try {
                    cursor.close();
                    if (!this.kq.isEmpty()) {
                        kq(this.kq);
                        this.kq.clear();
                    }
                } catch (Exception unused2) {
                }
                throw th3;
            }
        }
        oq();
        arrayList.size();
        return arrayList;
    }

    private void oq(int i10, long j10) {
        if (j10 > 0 || i10 > 0) {
            com.bytedance.sdk.component.rhi.kq.kq.kq.bob.kq(csi(), oq(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)});
            oq();
        }
    }

    public static String oq(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public List<com.bytedance.sdk.component.rhi.kq.fou.kq> kq(String str) {
        com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar = this.fou;
        if (kqVar == null) {
            return new ArrayList();
        }
        return kq(kqVar.oq(), str);
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
        if (this.fou == null) {
            return false;
        }
        int iKq = kq();
        int iKq2 = this.fou.kq();
        oq();
        if (com.bytedance.sdk.component.rhi.kq.bob.kq.bob() && (i10 == 1 || i10 == 2)) {
            return iKq > 0;
        }
        return iKq >= iKq2;
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
