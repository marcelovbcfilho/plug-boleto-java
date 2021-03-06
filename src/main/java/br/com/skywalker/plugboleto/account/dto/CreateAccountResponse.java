package br.com.skywalker.plugboleto.account.dto;

import br.com.skywalker.plugboleto.agreement.dto.ListedAgreement;
import br.com.skywalker.plugboleto.common.Response;
import br.com.skywalker.plugboleto.common.ResponseStatus;
import br.com.skywalker.plugboleto.util.DateUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

public class CreateAccountResponse extends Response<CreateAccountResponse.CreateAccountResponseData> {
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreateAccountResponseData {
        @JsonProperty("id")
        private long id;

        @JsonProperty("codigo_banco")
        private String bankCode;

        @JsonProperty("agencia")
        private String branch;

        @JsonProperty("agencia_dv")
        private String branchVerificationDigit;

        @JsonProperty("account")
        private String accountNumber;

        @JsonProperty("conta_dv")
        private String accountNumberVerificationDigit;

        @JsonProperty("tipo_conta")
        private String accountType;

        @JsonProperty("cod_beneficiario")
        private String accountDrawer;

        @JsonProperty("id_cedente")
        private long assignorId;

        @JsonProperty("criado")
        private String creationDate;

        @JsonProperty("atualizado")
        private String lastUpdate;

        @JsonProperty("cod_empresa")
        private String accountCompanyCode;

        @JsonProperty("convenios")
        private List<ListedAgreement> agreements;

        @JsonProperty("_campo")
        private String errorField;

        @JsonProperty("_erro")
        private String errorMessage;

        public LocalDateTime getCreationDate(){ return DateUtil.fromStringToLocalDateTime(this.creationDate); }
        public LocalDateTime getLastUpdate(){ return DateUtil.fromStringToLocalDateTime(this.lastUpdate); }
    }
}

/*
    "id": 168,
    "codigo_banco": "341",
    "agencia": "1234",
    "agencia_dv": "1",
    "conta": "59698",
    "conta_dv": "3",
    "tipo_conta": "CORRENTE",
    "cod_beneficiario": "60473",
    "id_cedente": 44,
    "criado": "2017-03-30T16:53:48.000Z",
    "atualizado": "2017-03-30T16:53:48.000Z",
    "cod_empresa": null,
    "convenios": []
*/