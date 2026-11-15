package androidx.core.widget;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class f extends a {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final ListView f9376J;

    public f(ListView listView) {
        super(listView);
        this.f9376J = listView;
    }

    @Override // androidx.core.widget.a
    public boolean b(int i10) {
        return false;
    }

    @Override // androidx.core.widget.a
    public boolean e(int i10) {
        ListView listView = this.f9376J;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i10 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    public void n(int i10, int i11) {
        this.f9376J.scrollListBy(i11);
    }
}
