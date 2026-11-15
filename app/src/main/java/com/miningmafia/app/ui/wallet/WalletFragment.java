package com.miningmafia.app.ui.wallet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.miningmafia.app.R;
import com.miningmafia.app.databinding.FragmentWalletBinding;
import com.miningmafia.app.data.remote.model.AccountBalance;
import com.miningmafia.app.data.remote.model.WalletSummary;
import com.miningmafia.app.ui.viewmodel.WalletViewModel;
import java.util.List;

/**
 * Wallet screen: combined + per-account balances, pending/confirmed rewards.
 */
public class WalletFragment extends Fragment {

    private FragmentWalletBinding binding;
    private WalletViewModel viewModel;
    private BalanceAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentWalletBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(WalletViewModel.class);

        adapter = new BalanceAdapter(new java.util.ArrayList<>());
        binding.recyclerBalances.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.recyclerBalances.setAdapter(adapter);

        viewModel.summary.observe(getViewLifecycleOwner(), summary -> {
            if (summary == null) return;
            binding.txtTotal.setText(String.format("%.8f", summary.totalBalance));
            binding.txtTotalCurrency.setText(summary.currency);
            binding.txtPending.setText(String.format("%.8f", summary.pendingRewards));
            binding.txtConfirmed.setText(String.format("%.8f", summary.confirmedRewards));
            adapter.submitList(summary.accounts != null ? summary.accounts : new java.util.ArrayList<>());
        });

        viewModel.uiState.observe(getViewLifecycleOwner(), state -> {
            if (state.error != null) {
                binding.txtLimitation.setVisibility(View.VISIBLE);
                binding.txtLimitation.setText(state.error);
                Toast.makeText(requireContext(), state.error, Toast.LENGTH_LONG).show();
            } else {
                binding.txtLimitation.setVisibility(View.GONE);
            }
            if (state.message != null) {
                Toast.makeText(requireContext(), state.message, Toast.LENGTH_SHORT).show();
            }
        });

        viewModel.load();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private static class BalanceAdapter extends RecyclerView.Adapter<BalanceAdapter.ViewHolder> {
        private List<AccountBalance> items = new java.util.ArrayList<>();
        BalanceAdapter(List<AccountBalance> items) { this.items = items; }
        void submitList(List<AccountBalance> list) { this.items = list != null ? list : new java.util.ArrayList<>(); notifyDataSetChanged(); }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
            return new ViewHolder(v);
        }
        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            AccountBalance a = items.get(position);
            holder.txt1.setText(a.displayName != null ? a.displayName : a.email);
            holder.txt2.setText(String.format("%.8f %s", a.balance, a.currency));
        }
        @Override
        public int getItemCount() { return items.size(); }
        static class ViewHolder extends RecyclerView.ViewHolder {
            TextView txt1, txt2;
            ViewHolder(View v) { super(v); txt1 = v.findViewById(android.R.id.text1); txt2 = v.findViewById(android.R.id.text2); }
        }
    }
}
