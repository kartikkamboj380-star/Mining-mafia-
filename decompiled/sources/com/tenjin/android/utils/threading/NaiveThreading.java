package com.tenjin.android.utils.threading;

/* JADX INFO: loaded from: classes3.dex */
public class NaiveThreading implements IThreading {
    @Override // com.tenjin.android.utils.threading.IThreading
    public void post(Runnable runnable) {
        new Thread(runnable).start();
    }
}
