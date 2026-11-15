package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f13558a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ReentrantLock f13559b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileLock f13561d;

    private b(String str, FileLock fileLock) {
        this.f13560c = str;
        this.f13561d = fileLock;
    }

    public static b a(String str) throws Exception {
        f13559b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = f13558a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e10) {
            f13559b.unlock();
            throw e10;
        }
    }

    public final void a() {
        try {
            this.f13561d.a();
            this.f13561d.b();
            Lock lock = f13558a.get(this.f13560c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f13559b.unlock();
        }
    }
}
