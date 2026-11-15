package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
class h extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f39075d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f39076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f39077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f39078c;

    static {
        f39075d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public h() {
        Calendar calendarI = t.i();
        this.f39076a = calendarI;
        this.f39077b = calendarI.getMaximum(7);
        this.f39078c = calendarI.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f39078c;
        int i12 = this.f39077b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f39077b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f39077b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(p186s5.g.f48795m, viewGroup, false);
        }
        this.f39076a.set(7, b(i10));
        textView.setText(this.f39076a.getDisplayName(7, f39075d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(p186s5.i.f48821q), this.f39076a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public h(int i10) {
        Calendar calendarI = t.i();
        this.f39076a = calendarI;
        this.f39077b = calendarI.getMaximum(7);
        this.f39078c = i10;
    }
}
