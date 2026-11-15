package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ph0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC4772ph0 extends AbstractAsyncTaskC4898qh0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet f32453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f32454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f32455e;

    public AbstractAsyncTaskC4772ph0(C4142kh0 c4142kh0, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(c4142kh0);
        this.f32453c = new HashSet(hashSet);
        this.f32454d = jSONObject;
        this.f32455e = j10;
    }
}
