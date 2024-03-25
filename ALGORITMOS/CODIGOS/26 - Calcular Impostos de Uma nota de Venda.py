valor_informado = float(input("Digite o valor da nota"))

pis = valor_informado * 0.0065
cofins = valor_informado * 0.03
irpj = valor_informado * 0.012
csll = valor_informado * 0.0108
print("------------------------")
print(f"PIS: R${pis:.2f}")
print("------------------------")
print(f"COFINS: R${cofins:.2f}")
print("------------------------")
print(f"IRPJ: R${irpj:.2f}")
print("------------------------")
print(f"CSLL: R${csll:.2f}")