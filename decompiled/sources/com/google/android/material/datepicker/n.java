package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class n extends BaseAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f39163e = t.i().getMaximum(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f39164f = (t.i().getMaximum(5) + t.i().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final m f39165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Collection f39166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f39167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final a f39168d;

    n(m mVar, d dVar, a aVar, g gVar) {
        this.f39165a = mVar;
        this.f39168d = aVar;
        this.f39166b = dVar.V();
    }

    private String c(Context context, long j10) {
        return e.a(context, j10, j(j10), i(j10), g(j10));
    }

    private void f(Context context) {
        if (this.f39167c == null) {
            this.f39167c = new c(context);
        }
    }

    private boolean h(long j10) {
        throw null;
    }

    private boolean j(long j10) {
        return t.g().getTimeInMillis() == j10;
    }

    private void m(TextView textView, long j10, int i10) {
        b bVar;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(c(textView.getContext(), j10));
        if (this.f39168d.f().w(j10)) {
            textView.setEnabled(true);
            boolean zH = h(j10);
            textView.setSelected(zH);
            if (zH) {
                bVar = this.f39167c.f39067b;
            } else {
                bVar = j(j10) ? this.f39167c.f39068c : this.f39167c.f39066a;
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f39167c.f39072g;
        }
        bVar.b(textView);
    }

    private void n(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (m.e(j10).equals(this.f39165a)) {
            int i10 = this.f39165a.i(j10);
            m((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(i10) - materialCalendarGridView.getFirstVisiblePosition()), j10, i10);
        }
    }

    int a(int i10) {
        return b() + (i10 - 1);
    }

    int b() {
        return this.f39165a.g(this.f39168d.h());
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < b() || i10 > k()) {
            return null;
        }
        return Long.valueOf(this.f39165a.h(l(i10)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        f(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(p186s5.g.f48794l, viewGroup, false);
        }
        int iB = i10 - b();
        if (iB >= 0) {
            m mVar = this.f39165a;
            if (iB >= mVar.f39160e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i11 = -1;
            } else {
                i11 = iB + 1;
                textView.setTag(mVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i11)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i11 = -1;
        }
        Long item = getItem(i10);
        if (item == null) {
            return textView;
        }
        m(textView, item.longValue(), i11);
        return textView;
    }

    boolean g(long j10) {
        throw null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f39164f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f39165a.f39159d;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(long j10) {
        throw null;
    }

    int k() {
        return (b() + this.f39165a.f39160e) - 1;
    }

    int l(int i10) {
        return (i10 - b()) + 1;
    }

    public void o(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f39166b.iterator();
        while (it.hasNext()) {
            n(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    boolean p(int i10) {
        return i10 >= b() && i10 <= k();
    }
}
