package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f13439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13440b = 1;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a, reason: collision with other inner class name */
    static class C0218a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f13443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f13444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f13446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        File f13447e;

        C0218a(String str, String str2, int i10, long j10, File file) {
            this.f13443a = str;
            this.f13444b = str2;
            this.f13445c = i10;
            this.f13446d = j10;
            this.f13447e = file;
        }
    }

    public a(List<String> list) {
        this.f13439a = list;
    }

    public static void a(final Context context, Map<String, ComponentModel.b> map, File file, com.bykv.vk.openvk.preload.geckox.d.a aVar) {
        final ArrayList arrayList;
        ComponentModel.b value;
        List<ComponentModel.a> list;
        List<Long> listB;
        List<Long> listB2;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ComponentModel.b> entry : map.entrySet()) {
                String key = entry.getKey();
                File file2 = new File(file, key);
                if (file2.isDirectory() && (value = entry.getValue()) != null && (list = value.f13577a) != null && !list.isEmpty()) {
                    List<ComponentModel.a> list2 = value.f13577a;
                    HashSet hashSet = new HashSet();
                    for (ComponentModel.a aVar2 : list2) {
                        String str = aVar2.f13574a;
                        if (!hashSet.contains(str)) {
                            hashSet.add(str);
                            int i10 = aVar2.f13575b;
                            List<Long> list3 = aVar2.f13576c;
                            File file3 = new File(file2, str);
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        File file4 = new File(file2, str);
                                        File file5 = new File(file2, str + "--pending-delete");
                                        file4.renameTo(file5);
                                        arrayList.add(new C0218a(key, str, i10, 0L, file5));
                                    }
                                } else if (list3 != null && (listB = g.b(file3)) != null && !listB.isEmpty()) {
                                    for (Long l10 : listB) {
                                        if (list3.get(0).longValue() > l10.longValue()) {
                                            File file6 = new File(file3, l10 + "--pending-delete");
                                            new File(file3, String.valueOf(l10)).renameTo(file6);
                                            arrayList.add(new C0218a(key, str, i10, l10.longValue(), file6));
                                        }
                                    }
                                }
                            } else if (list3 != null && (listB2 = g.b(file3)) != null && !listB2.isEmpty()) {
                                for (Long l11 : listB2) {
                                    if (list3.contains(l11)) {
                                        File file7 = new File(file3, l11 + "--pending-delete");
                                        new File(file3, String.valueOf(l11)).renameTo(file7);
                                        arrayList.add(new C0218a(key, str, i10, l11.longValue(), file7));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    List<C0218a> list4 = arrayList;
                    if (list4 != null && !list4.isEmpty()) {
                        for (C0218a c0218a : list4) {
                            File file8 = c0218a.f13447e;
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            boolean zA = com.bykv.vk.openvk.preload.geckox.utils.b.a(file8);
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            if (zA) {
                                b.a(context2).a(c0218a.f13443a, c0218a.f13444b, c0218a.f13445c, TTAdConstant.MATE_VALID, c0218a.f13446d, 0, null, jUptimeMillis2 - jUptimeMillis);
                            } else {
                                b.a(context2).a(c0218a.f13443a, c0218a.f13444b, c0218a.f13445c, 201, c0218a.f13446d, 601, "delete failed", jUptimeMillis2 - jUptimeMillis);
                            }
                        }
                    }
                } catch (Exception e11) {
                    GeckoLogger.w("clean-channel", "", e11);
                }
            }
        });
    }

    public static List<StatisticModel.PackageStatisticModel> a(Context context) {
        return b.a(context).a();
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.c()) {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.a()), e.a(bVar.a()), bVar.l(), bVar.m());
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(b.a(bVar.a()).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String str = "https://" + bVar.j() + "/gecko/server/packages/stats";
            try {
                Response responseDoPost = bVar.i().doPost(str, statisticModel.toJson());
                if (responseDoPost.code == 200) {
                    if (new JSONObject(responseDoPost.body).getInt("status") != 0) {
                        throw new RuntimeException("upload failed");
                    }
                } else {
                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f13439a != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.f13439a.size(); i10++) {
                    jSONArray.put(this.f13439a.get(i10));
                }
                jSONObject.put("gecko_accesskey", jSONArray);
            }
            jSONObject.put("os", 0);
            jSONObject.put("msg_type", this.f13440b);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
