<fieldset>
    <legend id="deceasedLabel">${config.label}</legend>

    <h3>${ui.message("referenceapplication.registrationapp.deceased.question")}</h3>

    <p>
        <input id="checkbox-deceased" type="checkbox"/>
        <label for="checkbox-deceased">${ui.message("aijar.registrationapp.deceased.label")}</label>
    </p>
<p>
    <label for="deceased-status">
        ${config.label}
        <span>(${ ui.message("emr.formValidation.messages.requiredField.label") })</span>
    </label>
    <select name="${config.formFieldName}" id="deceased-status">
        <option value ="1067AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA">Unknown</option>
        <option value ="29d7b33e-8a28-4afa-988e-bf2e0db74958">Disease</option>
        <option value ="94e63b74-5e55-4d80-bbae-b5aa3860edea">Accident</option>
    </select>
    <span class="field-error"></span>
</p>
</fieldset>