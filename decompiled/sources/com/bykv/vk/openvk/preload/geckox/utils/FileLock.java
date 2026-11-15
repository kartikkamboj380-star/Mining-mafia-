package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FileLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f13617a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f13619c;

    static {
        System.loadLibrary("file_lock_pgl");
    }

    private FileLock(String str, int i10) {
        this.f13619c = str;
        this.f13618b = i10;
    }

    public static FileLock a(String str) {
        try {
            int iD = d(str);
            nLockFile(iD);
            return new FileLock(str, iD);
        } catch (Exception e10) {
            throw new RuntimeException("lock failed, file:" + str + ", pid:" + Process.myPid() + " caused by:" + e10.getMessage());
        }
    }

    public static FileLock b(String str) {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            return null;
        } catch (Exception e10) {
            throw new RuntimeException("try lock failed, file:" + str + " caused by:" + e10.getMessage());
        }
    }

    public static FileLock c(String str) {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            new FileLock(str, iD).b();
            return null;
        } catch (Exception e10) {
            throw new RuntimeException("try lock failed, file:" + str + " caused by:" + e10.getMessage());
        }
    }

    private static int d(String str) {
        Integer numValueOf;
        Map<String, Integer> map = f13617a;
        synchronized (map) {
            try {
                numValueOf = map.get(str);
                if (numValueOf == null) {
                    new File(str).getParentFile().mkdirs();
                    numValueOf = Integer.valueOf(nGetFD(str));
                    map.put(str, numValueOf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return numValueOf.intValue();
    }

    private static native int nGetFD(String str);

    private static native void nLockFile(int i10);

    private static native void nLockFileSegment(int i10, int i11);

    private static native void nRelease(int i10);

    private static native boolean nTryLock(int i10);

    private static native void nUnlockFile(int i10);

    public static FileLock a(String str, int i10) {
        try {
            int iD = d(str);
            nLockFileSegment(iD, i10);
            return new FileLock(str, iD);
        } catch (Exception e10) {
            throw new RuntimeException("lock segment failed, file:" + str + " caused by:" + e10.getMessage());
        }
    }

    public final void b() {
        Integer numRemove;
        Map<String, Integer> map = f13617a;
        synchronized (map) {
            numRemove = map.remove(this.f13619c);
        }
        try {
            nRelease(numRemove.intValue());
        } catch (Exception e10) {
            throw new RuntimeException("release lock failed, file:" + this.f13619c + " caused by:" + e10.getMessage());
        }
    }

    public final void a() {
        try {
            nUnlockFile(this.f13618b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.f13619c);
        }
    }
}
