package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"CI_StaticFieldLeak"})
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f13454a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f13455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected a f13456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected File f13457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected List<String> f13458e;

    static {
        new f();
        f13455b = new e();
    }

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.f13456c = aVar;
        this.f13457d = file;
        this.f13458e = list;
    }
}
