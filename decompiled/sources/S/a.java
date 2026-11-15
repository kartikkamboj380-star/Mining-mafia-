package S;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, S.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f5330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f5331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Cursor f5332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f5333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f5334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C0078a f5335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected DataSetObserver f5336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected S.b f5337h;

    /* JADX INFO: renamed from: S.a$a, reason: collision with other inner class name */
    private class C0078a extends ContentObserver {
        C0078a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z9) {
            a.this.l();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f5330a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f5330a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z9) {
        i(context, cursor, z9 ? 1 : 2);
    }

    @Override // S.b.a
    public void b(Cursor cursor) {
        Cursor cursorM = m(cursor);
        if (cursorM != null) {
            cursorM.close();
        }
    }

    @Override // S.b.a
    public abstract CharSequence convertToString(Cursor cursor);

    @Override // S.b.a
    public Cursor f() {
        return this.f5332c;
    }

    public abstract void g(View view, Context context, Cursor cursor);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f5330a || (cursor = this.f5332c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f5330a) {
            return null;
        }
        this.f5332c.moveToPosition(i10);
        if (view == null) {
            view = j(this.f5333d, this.f5332c, viewGroup);
        }
        g(view, this.f5333d, this.f5332c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f5337h == null) {
            this.f5337h = new S.b(this);
        }
        return this.f5337h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f5330a || (cursor = this.f5332c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f5332c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f5330a && (cursor = this.f5332c) != null && cursor.moveToPosition(i10)) {
            return this.f5332c.getLong(this.f5334e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f5330a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f5332c.moveToPosition(i10)) {
            if (view == null) {
                view = k(this.f5333d, this.f5332c, viewGroup);
            }
            g(view, this.f5333d, this.f5332c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    void i(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f5331b = true;
        } else {
            this.f5331b = false;
        }
        boolean z9 = cursor != null;
        this.f5332c = cursor;
        this.f5330a = z9;
        this.f5333d = context;
        this.f5334e = z9 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f5335f = new C0078a();
            this.f5336g = new b();
        } else {
            this.f5335f = null;
            this.f5336g = null;
        }
        if (z9) {
            C0078a c0078a = this.f5335f;
            if (c0078a != null) {
                cursor.registerContentObserver(c0078a);
            }
            DataSetObserver dataSetObserver = this.f5336g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View j(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View k(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void l() {
        Cursor cursor;
        if (!this.f5331b || (cursor = this.f5332c) == null || cursor.isClosed()) {
            return;
        }
        this.f5330a = this.f5332c.requery();
    }

    public Cursor m(Cursor cursor) {
        Cursor cursor2 = this.f5332c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0078a c0078a = this.f5335f;
            if (c0078a != null) {
                cursor2.unregisterContentObserver(c0078a);
            }
            DataSetObserver dataSetObserver = this.f5336g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f5332c = cursor;
        if (cursor == null) {
            this.f5334e = -1;
            this.f5330a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0078a c0078a2 = this.f5335f;
        if (c0078a2 != null) {
            cursor.registerContentObserver(c0078a2);
        }
        DataSetObserver dataSetObserver2 = this.f5336g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f5334e = cursor.getColumnIndexOrThrow("_id");
        this.f5330a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
