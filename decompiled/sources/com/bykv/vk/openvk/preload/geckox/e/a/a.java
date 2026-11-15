package com.bykv.vk.openvk.preload.geckox.e.a;

import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f13551a;

    public a(File file) {
        this.f13551a = file;
    }

    protected abstract InputStream a(File file, String str);

    public final InputStream a(String str) {
        return a(this.f13551a, str);
    }

    protected abstract boolean b(File file, String str);

    public final boolean b(String str) {
        return b(this.f13551a, str);
    }
}
