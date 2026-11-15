package com.pgl.ssdk;

import com.pgl.ssdk.a2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public class a3<T extends a2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BlockingQueue<T> f41892b = new LinkedBlockingQueue();

    private a3(int i10) {
        this.f41891a = i10;
    }

    public static a3 a(int i10) {
        return new a3(i10);
    }

    public T a() {
        return this.f41892b.poll();
    }
}
