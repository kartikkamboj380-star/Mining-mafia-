package com.bytedance.adsdk.ugeno.syt;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class oq {
    private final DataSetObservable kq = new DataSetObservable();
    private DataSetObserver oq;

    public void bob() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.oq;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.kq.notifyChanged();
    }

    public float kq(int i10) {
        return 1.0f;
    }

    public abstract int kq();

    public abstract boolean kq(View view, Object obj);

    public Parcelable oq() {
        return null;
    }

    public int kq(Object obj) {
        return -1;
    }

    public Object kq(ViewGroup viewGroup, int i10) {
        return kq((View) viewGroup, i10);
    }

    public void kq(ViewGroup viewGroup, int i10, Object obj) {
        kq((View) viewGroup, i10, obj);
    }

    @Deprecated
    public Object kq(View view, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void kq(View view, int i10, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    void kq(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.oq = dataSetObserver;
        }
    }
}
