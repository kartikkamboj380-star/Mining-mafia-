package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2887ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f26601a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f26602b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f26603c = new ArrayList();

    public final void a(AbstractC2759Zh abstractC2759Zh) {
        this.f26601a.add(abstractC2759Zh);
    }

    public final void b(AbstractC2759Zh abstractC2759Zh) {
        this.f26602b.add(abstractC2759Zh);
    }

    public final void c(AbstractC2759Zh abstractC2759Zh) {
        this.f26603c.add(abstractC2759Zh);
    }

    public final void d(SharedPreferences.Editor editor, int i10, JSONObject jSONObject) {
        for (AbstractC2759Zh abstractC2759Zh : this.f26601a) {
            if (abstractC2759Zh.m() == 1) {
                abstractC2759Zh.b(editor, abstractC2759Zh.c(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            L4.p.c("Flag Json is null.");
        }
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f26602b.iterator();
        while (it.hasNext()) {
            String str = (String) H4.B.c().d((AbstractC2759Zh) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(AbstractC4017ji.a());
        return arrayList;
    }

    public final List f() {
        List listE = e();
        Iterator it = this.f26603c.iterator();
        while (it.hasNext()) {
            String str = (String) H4.B.c().d((AbstractC2759Zh) it.next());
            if (!TextUtils.isEmpty(str)) {
                listE.add(str);
            }
        }
        listE.addAll(AbstractC4017ji.b());
        return listE;
    }
}
