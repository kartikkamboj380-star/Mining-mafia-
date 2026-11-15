package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f7636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7637b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LayoutInflater f7640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7641f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z9, int i10) {
        this.f7639d = z9;
        this.f7640e = layoutInflater;
        this.f7636a = eVar;
        this.f7641f = i10;
        a();
    }

    void a() {
        g gVarX = this.f7636a.x();
        if (gVarX != null) {
            ArrayList arrayListB = this.f7636a.B();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((g) arrayListB.get(i10)) == gVarX) {
                    this.f7637b = i10;
                    return;
                }
            }
        }
        this.f7637b = -1;
    }

    public e b() {
        return this.f7636a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList arrayListB = this.f7639d ? this.f7636a.B() : this.f7636a.G();
        int i11 = this.f7637b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (g) arrayListB.get(i10);
    }

    public void d(boolean z9) {
        this.f7638c = z9;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayListB = this.f7639d ? this.f7636a.B() : this.f7636a.G();
        return this.f7637b < 0 ? arrayListB.size() : arrayListB.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f7640e.inflate(this.f7641f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f7636a.I() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f7638c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.f(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
