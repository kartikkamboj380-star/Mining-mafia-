package com.bytedance.sdk.component.syt;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.nze;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    private static AtomicInteger bob = new AtomicInteger(0);
    public static final String[] kq = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};
    public static final String[] oq = {"tt_pangle", "bd_tracker"};
    private static int fou = 0;
    private static int csi = 0;

    public static class kq {
        public String bob;
        public String fou;
        public int kq;
        public String oq;

        public kq(String str, int i10, String str2, String str3) {
            this.bob = str;
            this.kq = i10;
            this.fou = str2;
            this.oq = str3;
        }

        public void kq(int i10) {
            this.kq = i10;
        }

        public String toString() {
            return "ThreadModel{times=" + this.kq + ", name='" + this.oq + "', lastStackStack='" + this.bob + "'}";
        }

        public int kq() {
            return this.kq;
        }
    }

    public static void kq() {
        try {
            oq();
        } catch (Throwable unused) {
        }
    }

    private static void oq() {
        int i10;
        bob bobVarRjo = rhi.rjo();
        if (bobVarRjo == null) {
            return;
        }
        int i11 = 1;
        int iAddAndGet = bob.addAndGet(1);
        int i12 = rhi.bob;
        if (i12 < 0 || iAddAndGet % i12 != 0 || Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        HashMap map = new HashMap();
        if (allStackTraces == null) {
            return;
        }
        boolean zKq = nze.kq();
        int size = allStackTraces.size();
        if (size > csi) {
            csi = size;
        }
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next = it.next();
            i14 += i11;
            Thread key = next.getKey();
            StackTraceElement[] value = next.getValue();
            StringBuilder sb = new StringBuilder("\n");
            if (zKq) {
                sb.append("Thread Name is : " + key.getName());
                sb.append("\n");
            }
            int length = value.length;
            String str = null;
            int i15 = 0;
            while (i15 < length) {
                int i16 = i11;
                String string = value[i15].toString();
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                if (zKq) {
                    sb.append(string + "\n");
                }
                if (TextUtils.isEmpty(str) && (kq(string, kq) || kq(key.getName(), oq))) {
                    i13++;
                    str = string;
                }
                i15++;
                it = it2;
                i11 = i16;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
            int i17 = i11;
            if (zKq) {
                if (TextUtils.isEmpty(str)) {
                    i10 = i17;
                } else {
                    String str2 = str + "&" + key.getName();
                    kq kqVar = (kq) map.get(str2);
                    if (kqVar != null) {
                        kqVar.kq(kqVar.kq() + 1);
                        i10 = i17;
                    } else {
                        String string2 = sb.toString();
                        String name = key.getName();
                        i10 = i17;
                        kqVar = new kq(str2, i10, string2, name);
                    }
                    map.put(str2, kqVar);
                }
                if (!TextUtils.isEmpty(sb.toString())) {
                    Log.e("PoolTaskStatistics", "Thread index = " + i14 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    Log.w("PoolTaskStatistics", sb.toString());
                }
            } else {
                i10 = i17;
            }
            i11 = i10;
            it = it3;
        }
        if (i13 > fou) {
            fou = i13;
        }
        if (zKq) {
            Log.e("PoolTaskStatistics", "SDK current threads=" + i13 + ", SDK Max threads=" + fou + ", Application threads = " + size + ", Application max threads = " + csi);
            Iterator it4 = map.entrySet().iterator();
            while (it4.hasNext()) {
                Log.i("PoolTaskStatistics", ((kq) ((Map.Entry) it4.next()).getValue()).toString());
            }
        }
        bobVarRjo.kq(new com.bytedance.sdk.component.syt.oq.kq(i13, fou, size, csi));
    }

    private static boolean kq(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
