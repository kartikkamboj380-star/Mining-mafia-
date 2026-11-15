package com.bytedance.sdk.openadsdk.oq;

import com.bytedance.sdk.component.utils.rjo;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq {
    protected boolean kq = false;
    private final ExecutorService oq = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.oq.kq$kq, reason: collision with other inner class name */
    private class CallableC0315kq implements Callable<Void> {
        private final File oq;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public Void call() {
            kq.this.oq(this.oq);
            return null;
        }

        private CallableC0315kq(File file) {
            this.oq = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oq(File file) {
        if (!this.kq) {
            try {
                rjo.oq(file);
            } catch (Throwable unused) {
            }
            kq(rjo.kq(file.getParentFile()));
        } else {
            List<File> listKq = rjo.kq(file);
            listKq.toString();
            kq(listKq);
        }
    }

    protected abstract void kq(List<File> list);

    protected abstract boolean kq(long j10, int i10);

    protected abstract boolean kq(File file, long j10, int i10);

    public void kq(File file) {
        this.oq.submit(new CallableC0315kq(file));
    }

    long oq(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }
}
