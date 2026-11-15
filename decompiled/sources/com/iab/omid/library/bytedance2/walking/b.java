package com.iab.omid.library.bytedance2.walking;

import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0388b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f41856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.walking.async.c f41857b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.f41857b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0388b
    public JSONObject a() {
        return this.f41856a;
    }

    public void b() {
        this.f41857b.b(new d(this));
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0388b
    public void a(JSONObject jSONObject) {
        this.f41856a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f41857b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f41857b.b(new e(this, hashSet, jSONObject, j10));
    }
}
